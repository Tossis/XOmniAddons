package com.tossis.android.xposed.omnirom.addons.util;

import java.io.IOException;
import java.io.OutputStream;

public class Utils
{
  private static java.lang.Process process;

  public static boolean testRootAccess()
  {
    try
    {
      if (Runtime.getRuntime().exec("su -c ls").waitFor() == 0) {
    	  return true;
      } else {
    	  return false;
      }
    }
    catch (IOException localIOException)
    {
      localIOException.printStackTrace();
      return false;
    }
    catch (InterruptedException localInterruptedException)
    {
      localInterruptedException.printStackTrace();
      return false;
    }
  }
 
  public static void reboot()
  {
      runSuCommand("reboot");
  }

  public static void runSuCommand(String paramString)
  {
    try
    {
      if (process == null)
        process = Runtime.getRuntime().exec("su");
      OutputStream localOutputStream = process.getOutputStream();
      writeLine(localOutputStream, paramString);
      localOutputStream.flush();
      return;
    }
    catch (IOException localIOException)
    {
      localIOException.printStackTrace();
    }
  }

  private static void writeLine(OutputStream paramOutputStream, String paramString)
    throws IOException
  {
    paramOutputStream.write((paramString + "\n").getBytes());
  }
}