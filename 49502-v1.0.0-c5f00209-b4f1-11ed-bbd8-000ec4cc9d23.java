/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE134_Uncontrolled_Format_String__listen_tcp_printf_15.java
Label Definition File: CWE134_Uncontrolled_Format_String.label.xml
Template File: sources-sinks-15.tmpl.java
*/
/*
* @description
* CWE: 134 Uncontrolled Format String
* BadSource: listen_tcp Read data using a listening tcp connection
* GoodSource: A hardcoded string
* Sinks: printf
*    GoodSink: dynamic printf format with string defined
*    BadSink : dynamic printf without validation
* Flow Variant: 15 Control flow: switch(6) and switch(7)
*
* */

package testcases.CWE134_Uncontrolled_Format_String;

import testcasesupport.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.Socket;
import java.net.ServerSocket;

import java.util.logging.Logger;

public class CWE134_Uncontrolled_Format_String__listen_tcp_printf_15 extends AbstractTestCase
{

    public void bad() throws Throwable
    {
        String data;
        switch(6)
        {
        case 6:
        {
            Logger log_bad = Logger.getLogger("local-logger");
            data = ""; /* init data */
            /* Read data using a listening tcp connection */
            ServerSocket listener = null;
            Socket sock = null;
            BufferedReader buffread = null;
            InputStreamReader instrread = null;
            try
            {
                /* read input from socket */
                listener = new ServerSocket(39543);
                sock = listener.accept();
                instrread = new InputStreamReader(sock.getInputStream());
                buffread = new BufferedReader(instrread);
                data = buffread.readLine();
            }
            catch( IOException ioe )
            {
                log_bad.warning("Error with stream reading");
            }
            finally
            {
                /* clean up stream reading objects */
                try {
                    if( buffread != null )
                    {
                        buffread.close();
                    }
                }
                catch( IOException ioe )
                {
                    log_bad.warning("Error closing buffread");
                }
                finally {
                    try {
                        if( instrread != null )
                        {
                            instrread.close();
                        }
                    }
                    catch( IOException ioe )
                    {
                        log_bad.warning("Error closing instrread");
                    }
                }

                /* clean up socket objects */
                try {
                    if( sock != null )
                    {
                        sock.close();
                    }
                }
                catch( IOException e )
                {
                    log_bad.warning("Error closing sock");
                }
                finally {
                    try {
                        if( listener != null )
                        {
                            listener.close();
                        }
                    }
                    catch( IOException e )
                    {
                        log_bad.warning("Error closing listener");
                    }
                }
            }
        }
        break;
        default:
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
        {
            java.util.logging.Logger log_good = java.util.logging.Logger.getLogger("local-logger");
            /* FIX: Use a hardcoded string */
            data = "foo";
        }
        break;
        }

        switch(7)
        {
        case 7:
        {
            /* POTENTIAL FLAW: uncontrolled string formatting */
            System.out.printf(data);
        }
        break;
        default:
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
        {
            /* FIX: explicitly defined string formatting */
            System.out.printf("%s\n", data);
        }
        break;
        }
    }

    /* goodG2B1() - use goodsource and badsink by changing the first switch to switch(5) */
    private void goodG2B1() throws Throwable
    {
        String data;
        switch(5)
        {
        case 6:
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
        {
            Logger log_bad = Logger.getLogger("local-logger");
            data = ""; /* init data */
            /* Read data using a listening tcp connection */
            ServerSocket listener = null;
            Socket sock = null;
            BufferedReader buffread = null;
            InputStreamReader instrread = null;
            try
            {
                /* read input from socket */
                listener = new ServerSocket(39543);
                sock = listener.accept();
                instrread = new InputStreamReader(sock.getInputStream());
                buffread = new BufferedReader(instrread);
                data = buffread.readLine();
            }
            catch( IOException ioe )
            {
                log_bad.warning("Error with stream reading");
            }
            finally
            {
                /* clean up stream reading objects */
                try {
                    if( buffread != null )
                    {
                        buffread.close();
                    }
                }
                catch( IOException ioe )
                {
                    log_bad.warning("Error closing buffread");
                }
                finally {
                    try {
                        if( instrread != null )
                        {
                            instrread.close();
                        }
                    }
                    catch( IOException ioe )
                    {
                        log_bad.warning("Error closing instrread");
                    }
                }

                /* clean up socket objects */
                try {
                    if( sock != null )
                    {
                        sock.close();
                    }
                }
                catch( IOException e )
                {
                    log_bad.warning("Error closing sock");
                }
                finally {
                    try {
                        if( listener != null )
                        {
                            listener.close();
                        }
                    }
                    catch( IOException e )
                    {
                        log_bad.warning("Error closing listener");
                    }
                }
            }
        }
        break;
        default:
        {
            java.util.logging.Logger log_good = java.util.logging.Logger.getLogger("local-logger");
            /* FIX: Use a hardcoded string */
            data = "foo";
        }
        break;
        }

        switch(7)
        {
        case 7:
        {
            /* POTENTIAL FLAW: uncontrolled string formatting */
            System.out.printf(data);
        }
        break;
        default:
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
        {
            /* FIX: explicitly defined string formatting */
            System.out.printf("%s\n", data);
        }
        break;
        }
    }

    /* goodG2B2() - use goodsource and badsink by reversing the blocks in the first switch  */
    private void goodG2B2() throws Throwable
    {
        String data;
        switch(6)
        {
        case 6:
        {
            java.util.logging.Logger log_good = java.util.logging.Logger.getLogger("local-logger");
            /* FIX: Use a hardcoded string */
            data = "foo";
        }
        break;
        default:
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
        {
            Logger log_bad = Logger.getLogger("local-logger");
            data = ""; /* init data */
            /* Read data using a listening tcp connection */
            ServerSocket listener = null;
            Socket sock = null;
            BufferedReader buffread = null;
            InputStreamReader instrread = null;
            try
            {
                /* read input from socket */
                listener = new ServerSocket(39543);
                sock = listener.accept();
                instrread = new InputStreamReader(sock.getInputStream());
                buffread = new BufferedReader(instrread);
                data = buffread.readLine();
            }
            catch( IOException ioe )
            {
                log_bad.warning("Error with stream reading");
            }
            finally
            {
                /* clean up stream reading objects */
                try {
                    if( buffread != null )
                    {
                        buffread.close();
                    }
                }
                catch( IOException ioe )
                {
                    log_bad.warning("Error closing buffread");
                }
                finally {
                    try {
                        if( instrread != null )
                        {
                            instrread.close();
                        }
                    }
                    catch( IOException ioe )
                    {
                        log_bad.warning("Error closing instrread");
                    }
                }

                /* clean up socket objects */
                try {
                    if( sock != null )
                    {
                        sock.close();
                    }
                }
                catch( IOException e )
                {
                    log_bad.warning("Error closing sock");
                }
                finally {
                    try {
                        if( listener != null )
                        {
                            listener.close();
                        }
                    }
                    catch( IOException e )
                    {
                        log_bad.warning("Error closing listener");
                    }
                }
            }
        }
        break;
        }

        switch(7)
        {
        case 7:
        {
            /* POTENTIAL FLAW: uncontrolled string formatting */
            System.out.printf(data);
        }
        break;
        default:
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
        {
            /* FIX: explicitly defined string formatting */
            System.out.printf("%s\n", data);
        }
        break;
        }
    }

    /* goodB2G1() - use badsource and goodsink by changing the second switch to switch(8) */
    private void goodB2G1() throws Throwable
    {
        String data;
        switch(6)
        {
        case 6:
        {
            Logger log_bad = Logger.getLogger("local-logger");
            data = ""; /* init data */
            /* Read data using a listening tcp connection */
            ServerSocket listener = null;
            Socket sock = null;
            BufferedReader buffread = null;
            InputStreamReader instrread = null;
            try
            {
                /* read input from socket */
                listener = new ServerSocket(39543);
                sock = listener.accept();
                instrread = new InputStreamReader(sock.getInputStream());
                buffread = new BufferedReader(instrread);
                data = buffread.readLine();
            }
            catch( IOException ioe )
            {
                log_bad.warning("Error with stream reading");
            }
            finally
            {
                /* clean up stream reading objects */
                try {
                    if( buffread != null )
                    {
                        buffread.close();
                    }
                }
                catch( IOException ioe )
                {
                    log_bad.warning("Error closing buffread");
                }
                finally {
                    try {
                        if( instrread != null )
                        {
                            instrread.close();
                        }
                    }
                    catch( IOException ioe )
                    {
                        log_bad.warning("Error closing instrread");
                    }
                }

                /* clean up socket objects */
                try {
                    if( sock != null )
                    {
                        sock.close();
                    }
                }
                catch( IOException e )
                {
                    log_bad.warning("Error closing sock");
                }
                finally {
                    try {
                        if( listener != null )
                        {
                            listener.close();
                        }
                    }
                    catch( IOException e )
                    {
                        log_bad.warning("Error closing listener");
                    }
                }
            }
        }
        break;
        default:
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
        {
            java.util.logging.Logger log_good = java.util.logging.Logger.getLogger("local-logger");
            /* FIX: Use a hardcoded string */
            data = "foo";
        }
        break;
        }

        switch(8)
        {
        case 7:
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
        {
            /* POTENTIAL FLAW: uncontrolled string formatting */
            System.out.printf(data);
        }
        break;
        default:
        {
            /* FIX: explicitly defined string formatting */
            System.out.printf("%s\n", data);
        }
        break;
        }
    }

    /* goodB2G2() - use badsource and goodsink by reversing the blocks in the second switch  */
    private void goodB2G2() throws Throwable
    {
        String data;
        switch(6)
        {
        case 6:
        {
            Logger log_bad = Logger.getLogger("local-logger");
            data = ""; /* init data */
            /* Read data using a listening tcp connection */
            ServerSocket listener = null;
            Socket sock = null;
            BufferedReader buffread = null;
            InputStreamReader instrread = null;
            try
            {
                /* read input from socket */
                listener = new ServerSocket(39543);
                sock = listener.accept();
                instrread = new InputStreamReader(sock.getInputStream());
                buffread = new BufferedReader(instrread);
                data = buffread.readLine();
            }
            catch( IOException ioe )
            {
                log_bad.warning("Error with stream reading");
            }
            finally
            {
                /* clean up stream reading objects */
                try {
                    if( buffread != null )
                    {
                        buffread.close();
                    }
                }
                catch( IOException ioe )
                {
                    log_bad.warning("Error closing buffread");
                }
                finally {
                    try {
                        if( instrread != null )
                        {
                            instrread.close();
                        }
                    }
                    catch( IOException ioe )
                    {
                        log_bad.warning("Error closing instrread");
                    }
                }

                /* clean up socket objects */
                try {
                    if( sock != null )
                    {
                        sock.close();
                    }
                }
                catch( IOException e )
                {
                    log_bad.warning("Error closing sock");
                }
                finally {
                    try {
                        if( listener != null )
                        {
                            listener.close();
                        }
                    }
                    catch( IOException e )
                    {
                        log_bad.warning("Error closing listener");
                    }
                }
            }
        }
        break;
        default:
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
        {
            java.util.logging.Logger log_good = java.util.logging.Logger.getLogger("local-logger");
            /* FIX: Use a hardcoded string */
            data = "foo";
        }
        break;
        }

        switch(7)
        {
        case 7:
        {
            /* FIX: explicitly defined string formatting */
            System.out.printf("%s\n", data);
        }
        break;
        default:
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
        {
            /* POTENTIAL FLAW: uncontrolled string formatting */
            System.out.printf(data);
        }
        break;
        }
    }

    public void good() throws Throwable
    {
        goodG2B1();
        goodG2B2();
        goodB2G1();
        goodB2G2();
    }

    /* Below is the main(). It is only used when building this testcase on
       its own for testing or for building a binary to use in testing binary
       analysis tools. It is not used when compiling all the testcases as one
       application, which is how source code analysis tools are tested. */
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }
}
