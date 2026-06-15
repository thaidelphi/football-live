package i3;

import android.app.job.JobInfo;
import com.google.auto.value.AutoValue;
import i3.d;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
/* compiled from: SchedulerConfig.java */
@AutoValue
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class g {

    /* compiled from: SchedulerConfig.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private l3.a f26450a;

        /* renamed from: b  reason: collision with root package name */
        private Map<z2.d, b> f26451b = new HashMap();

        public a a(z2.d dVar, b bVar) {
            this.f26451b.put(dVar, bVar);
            return this;
        }

        public g b() {
            Objects.requireNonNull(this.f26450a, "missing required property: clock");
            if (this.f26451b.keySet().size() >= z2.d.values().length) {
                Map<z2.d, b> map = this.f26451b;
                this.f26451b = new HashMap();
                return g.d(this.f26450a, map);
            }
            throw new IllegalStateException("Not all priorities have been configured");
        }

        public a c(l3.a aVar) {
            this.f26450a = aVar;
            return this;
        }
    }

    /* compiled from: SchedulerConfig.java */
    @AutoValue
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static abstract class b {

        /* compiled from: SchedulerConfig.java */
        @AutoValue.Builder
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public static abstract class a {
            public abstract b a();

            public abstract a b(long j10);

            public abstract a c(Set<c> set);

            public abstract a d(long j10);
        }

        public static a a() {
            return new d.b().c(Collections.emptySet());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract long b();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract Set<c> c();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract long d();
    }

    /* compiled from: SchedulerConfig.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    private long a(int i10, long j10) {
        int i11;
        return (long) (Math.pow(3.0d, i10 - 1) * j10 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j10 > 1 ? j10 : 2L) * i11)));
    }

    public static a b() {
        return new a();
    }

    static g d(l3.a aVar, Map<z2.d, b> map) {
        return new i3.c(aVar, map);
    }

    public static g f(l3.a aVar) {
        return b().a(z2.d.DEFAULT, b.a().b(30000L).d(86400000L).a()).a(z2.d.HIGHEST, b.a().b(1000L).d(86400000L).a()).a(z2.d.VERY_LOW, b.a().b(86400000L).d(86400000L).c(i(c.DEVICE_IDLE)).a()).c(aVar).b();
    }

    private static <T> Set<T> i(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    private void j(JobInfo.Builder builder, Set<c> set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    public JobInfo.Builder c(JobInfo.Builder builder, z2.d dVar, long j10, int i10) {
        builder.setMinimumLatency(g(dVar, j10, i10));
        j(builder, h().get(dVar).c());
        return builder;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract l3.a e();

    public long g(z2.d dVar, long j10, int i10) {
        long a10 = j10 - e().a();
        b bVar = h().get(dVar);
        return Math.min(Math.max(a(i10, bVar.b()), a10), bVar.d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Map<z2.d, b> h();
}
