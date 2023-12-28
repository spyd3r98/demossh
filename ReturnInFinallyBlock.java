package javacodechecker;

public class ReturnInFinallyBlock {
    public void bad() throws Throwable
    {
        // EMB-ISSUE: CodeIssueNames.RETURN_IN_FINALLY_BLOCK
        try
        {
            throw new IllegalArgumentException();
        }
        catch(IllegalArgumentException exceptIllegalArgument)
        {
		//testing
		System.out.println("added new changes 123");
		//28-Dec-2023
		System.out.println("added new changes 123");
		System.out.println("added new changes 123");
		System.out.println("added new changes 123");
            IO.writeLine("preventing incidental issues");
        }
        finally
        {
            if(true)
            {
                return;
                System.out.println("Hi");
            }
        }

    }

    public void bad1() throws Throwable
    {
        // EMB-ISSUE: CodeIssueNames.RETURN_IN_FINALLY_BLOCK
        try
        {
            throw new IllegalArgumentException();
        }
        catch(IllegalArgumentException exceptIllegalArgument)
        {
            IO.writeLine("preventing incidental issues");
        }
        finally
        {
                return hello;
            System.out.println("Hello");
        }
	    try{}
	    catch(Exception e){}
    }


    private void good1() throws Throwable
    {
        // EMB-ISSUE: CodeIssueNames.RETURN_IN_FINALLY_BLOCK/no-detect
        try
        {
            throw new IllegalArgumentException();
        }
        catch(IllegalArgumentException exceptIllegalArgument)
        {
            IO.writeLine("preventing incidental issues");
        }
        finally
        {
            IO.writeLine("In finally block, cleaning up");
        }

    }

    private void good2() throws Throwable
    {
        // EMB-ISSUE: CodeIssueNames.RETURN_IN_FINALLY_BLOCK/no-detect
        try
        {
            throw new IllegalArgumentException();
        }
        catch(IllegalArgumentException exceptIllegalArgument)
        {
            IO.writeLine("preventing incidental issues");
        }
        finally
        {
            IO.writeLine("In finally block, cleaning up");
            return;
        }

    }
    public void good3() throws Throwable
    {
        // EMB-ISSUE: CodeIssueNames.RETURN_IN_FINALLY_BLOCK/no-detect
        try
        {
            throw new IllegalArgumentException();
        }
        catch(IllegalArgumentException exceptIllegalArgument)
        {
            IO.writeLine("preventing incidental issues");
        }catch(Exception e)
        {
            //this is added today
        }
        finally
        {
            if(true)
            {
                System.out.println("Hi");
                return;

            }
        }

    }

}
