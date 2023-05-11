package ch19.Sample;

public class DayState implements State {
    private static DayState singleton = new DayState(); // 하나의 상태만 필요하므로 Singleton 패턴 사용

    private DayState() {
    }

    public static State getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (hour < 8 || 21 <= hour) { // 현재 시각이 야간이면...
            context.changeState(NightState.getInstance()); // 현재 상태를 야간으로 바꿔라
        }
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("금고사용(주간)");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("비상벨(주간)");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("일반 통화(주간)");
    }

    @Override
    public String toString() {
        return "[주간]";
    }
}
