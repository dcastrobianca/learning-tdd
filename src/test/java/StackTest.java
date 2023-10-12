import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import unclebob.demo.Stack;


public class StackTest {

    private Stack stack;

    @Before
    public void setUp() throws Exception {
        stack = new Stack();
    }

    @Test
    public void newStack_ShouldBeEmpty(){
        assertTrue(stack.isEmpty());
    }

    @Test
    public void afterOnePush_ShouldNotBeEmpty(){
        stack.push(0);
        assertFalse(stack.isEmpty());
    }

    @Test(expected = Stack.UnderFlowException.class)
    public void willThrowUnderFlowException_WhenEmptyStackIsPoped(){
        stack.pop();
    }

    @Test
    public void afterOnePushAndOnePop_ShouldBeEmpty(){
        stack.push(0);;
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void afterPushTwiceAndPopOnce_ShouldNotBeEmpty(){
        stack.push(0);
        stack.push(0);
        stack.pop();
        assertFalse(stack.isEmpty());
    }

    @Test
    public void afterPushingX_ShouldPopX(){
        stack.push(0);
        assertEquals(0, stack.pop());
        stack.push(99);
        assertEquals(99, stack.pop());
    }
    @Test
    public void afterPushingXY_ShouldPopYX(){
        stack.push(99);
        stack.push(0);
        assertEquals(0, stack.pop());
        assertEquals(99, stack.pop());
    }
}
