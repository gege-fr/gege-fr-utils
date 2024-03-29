/*
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 */

package gp.utils.arrays;


/**
 *
 * @author Gwenhael Pasquiers
 */
public class PaddingArray extends ReadOnlyArray
{
    private Array data;
    
    private byte paddedValue;
    
    public PaddingArray(Array data, byte paddedValue, int paddedLength)
    {
        this.data = data;
        this.length = paddedLength;
        this.paddedValue = paddedValue;
    }

    @Override
    protected byte doGet(int i)
    {
        if(i >= data.length)
        {
            return this.paddedValue;
        }
        else
        {
            return this.data.get(i);
        }
    }

    @Override
    protected void doGetBytes(int sourceOffset, byte[] target, int targetOffset, int copyLength)
    {
        if(sourceOffset < data.length)
        {
            data.doGetBytes(sourceOffset, target, targetOffset, Math.min(copyLength, data.length));
        }

        if(sourceOffset + copyLength > data.length)
        {
            if(sourceOffset + copyLength > length)
            {
                throw new ArrayLengthException("can't doGetBytes, asked bytes from " + sourceOffset + " to " + (sourceOffset + copyLength) + ", array has a size of " + length);
            }

            int missingBytes = sourceOffset + copyLength - data.length;
            for(int i=0; i<missingBytes; i++)
            {
                target[targetOffset + copyLength - i - 1] = paddedValue;
            }
        }
    }
}
