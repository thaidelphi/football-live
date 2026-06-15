package c9;

import java.util.concurrent.TimeUnit;
/* compiled from: DurationUnitJvm.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public enum e {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);
    

    /* renamed from: a  reason: collision with root package name */
    private final TimeUnit f5615a;

    e(TimeUnit timeUnit) {
        this.f5615a = timeUnit;
    }

    public final TimeUnit b() {
        return this.f5615a;
    }
}
