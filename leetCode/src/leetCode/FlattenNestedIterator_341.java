/*
 * Given a nested list of integers, implement an iterator to flatten it.
 * Each element is either an integer, or a list -- whose elements may also be integers or other lists.
 * Example 1:
 * Given the list [[1,1],2,[1,1]],
 * By calling next repeatedly until hasNext returns false, the order of elements returned by next should be: [1,1,2,1,1].
 * Example 2:
 * Given the list [1,[4,[6]]],
 * By calling next repeatedly until hasNext returns false, the order of elements returned by next should be: [1,4,6].
*/

package leetCode;

import NestedInteger;
import java.util.Iterator;
import java.util.List;

public class FlattenNestedIterator_341 
{
	public class NestedIterator implements Iterator<Integer> 
	{
	    List<NestedInteger> nestedList;
	    public NestedIterator(List<NestedInteger> nestedList) 
	    {
	        List<leetCode.NestedInteger> nested;
			this.nestedList = nested;
	        
	    }
	    
	    @Override
	    public Integer next() 
	    {
	        
	    }

	    @Override
	    public boolean hasNext() 
	    {
	        
	    }
	}
}
