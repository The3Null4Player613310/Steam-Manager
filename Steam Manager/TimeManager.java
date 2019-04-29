import java.text.*;
import java.util.*;
public class TimeManager
{
    private boolean awake;
    private int wakeTime, sleepTime;
    private static SimpleDateFormat miliTime = new SimpleDateFormat("HHmm");

    public static int curTime()
    {
        String time = miliTime.format(new Date());
        return Integer.valueOf(time);
    }

    public boolean isAwake()
    {
        return awake;
    }

    public void updateWakeState()
    {
        if((curTime()>wakeTime) && (curTime()<sleepTime))
            awake = true;
        else
            awake = false;
    }

    public void setWakeTime(int inWakeTime)
    {
        wakeTime=inWakeTime;
    }

    public void setSleepTime(int inSleepTime)
    {
        sleepTime=inSleepTime;
    }
}
