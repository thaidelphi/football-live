package m1;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
/* compiled from: PreferenceUtils.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final WorkDatabase f27632a;

    public e(WorkDatabase workDatabase) {
        this.f27632a = workDatabase;
    }

    public static void b(Context context, v0.g gVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j10 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j11 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            gVar.g();
            try {
                gVar.x("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j10)});
                gVar.x("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j11)});
                sharedPreferences.edit().clear().apply();
                gVar.v();
            } finally {
                gVar.D();
            }
        }
    }

    public boolean a() {
        Long b10 = this.f27632a.h().b("reschedule_needed");
        return b10 != null && b10.longValue() == 1;
    }

    public void c(boolean z10) {
        this.f27632a.h().a(new l1.d("reschedule_needed", z10));
    }
}
