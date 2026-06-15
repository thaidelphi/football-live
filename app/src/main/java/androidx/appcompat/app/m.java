package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;
/* compiled from: TwilightManager.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class m {

    /* renamed from: d  reason: collision with root package name */
    private static m f1001d;

    /* renamed from: a  reason: collision with root package name */
    private final Context f1002a;

    /* renamed from: b  reason: collision with root package name */
    private final LocationManager f1003b;

    /* renamed from: c  reason: collision with root package name */
    private final a f1004c = new a();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TwilightManager.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f1005a;

        /* renamed from: b  reason: collision with root package name */
        long f1006b;

        /* renamed from: c  reason: collision with root package name */
        long f1007c;

        /* renamed from: d  reason: collision with root package name */
        long f1008d;

        /* renamed from: e  reason: collision with root package name */
        long f1009e;

        /* renamed from: f  reason: collision with root package name */
        long f1010f;

        a() {
        }
    }

    m(Context context, LocationManager locationManager) {
        this.f1002a = context;
        this.f1003b = locationManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m a(Context context) {
        if (f1001d == null) {
            Context applicationContext = context.getApplicationContext();
            f1001d = new m(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f1001d;
    }

    @SuppressLint({"MissingPermission"})
    private Location b() {
        Location c10 = androidx.core.content.b.b(this.f1002a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location c11 = androidx.core.content.b.b(this.f1002a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        return (c11 == null || c10 == null) ? c11 != null ? c11 : c10 : c11.getTime() > c10.getTime() ? c11 : c10;
    }

    private Location c(String str) {
        try {
            if (this.f1003b.isProviderEnabled(str)) {
                return this.f1003b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e8) {
            Log.d("TwilightManager", "Failed to get last known location", e8);
            return null;
        }
    }

    private boolean e() {
        return this.f1004c.f1010f > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j10;
        a aVar = this.f1004c;
        long currentTimeMillis = System.currentTimeMillis();
        l b10 = l.b();
        b10.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j11 = b10.f998a;
        b10.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z10 = b10.f1000c == 1;
        long j12 = b10.f999b;
        long j13 = b10.f998a;
        b10.a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j14 = b10.f999b;
        if (j12 == -1 || j13 == -1) {
            j10 = 43200000 + currentTimeMillis;
        } else {
            j10 = (currentTimeMillis > j13 ? 0 + j14 : currentTimeMillis > j12 ? 0 + j13 : 0 + j12) + 60000;
        }
        aVar.f1005a = z10;
        aVar.f1006b = j11;
        aVar.f1007c = j12;
        aVar.f1008d = j13;
        aVar.f1009e = j14;
        aVar.f1010f = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        a aVar = this.f1004c;
        if (e()) {
            return aVar.f1005a;
        }
        Location b10 = b();
        if (b10 != null) {
            f(b10);
            return aVar.f1005a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i10 = Calendar.getInstance().get(11);
        return i10 < 6 || i10 >= 22;
    }
}
