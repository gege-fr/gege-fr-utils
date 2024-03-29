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
public class DirectMappingArray extends Array
{
    private Array array;
    
    public DirectMappingArray(Array array)
    {
        this.array = array;
        this.length = array.length;
    }
    
    public void setArray(Array array) throws ArrayLengthException
    {
        if(this.array.length != array.length) throw new ArrayLengthException("new and old array must have the same length");
        
        this.array = array;
    }
    
    // <editor-fold desc=" Array interface " >
    @Override
    protected final byte doGet(int i)
    {
        // use doGet since it is a direct mapping
        return array.doGet(i);
    }

    @Override
    protected final void doSet(int i, byte value)
    {
        // use doGet since it is a direct mapping
        array.doSet(i, value);
    }

    @Override
    protected final void doSet(int i, int value)
    {
        // use doGet since it is a direct mapping
        array.doSet(i, value);
    }

    @Override
    public final byte[] getBytes()
    {
        // use array's getBytes since it is a direct mapping and array could be a DefaultArray
        return array.getBytes();
    }

    @Override
    protected void doGetBytes(int sourceOffset, byte[] target, int targetOffset, int copyLength)
    {
        array.doGetBytes(sourceOffset, target, targetOffset, copyLength);
    }
    // </editor-fold>
}
