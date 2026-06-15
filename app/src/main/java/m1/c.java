package m1;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
/* compiled from: IdGenerator.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final WorkDatabase f27630a;

    public c(WorkDatabase workDatabase) {
        this.f27630a = workDatabase;
    }

    public static void a(Context context, v0.g gVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences.contains("next_job_scheduler_id") || sharedPreferences.contains("next_job_scheduler_id")) {
            int i10 = sharedPreferences.getInt("next_job_scheduler_id", 0);
            int i11 = sharedPreferences.getInt("next_alarm_manager_id", 0);
            gVar.g();
            try {
                gVar.x("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i10)});
                gVar.x("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i11)});
                sharedPreferences.edit().clear().apply();
                gVar.v();
            } finally {
                gVar.D();
            }
        }
    }

    private int c(String str) {
        this.f27630a.beginTransaction();
        try {
            Long b10 = this.f27630a.h().b(str);
            int i10 = 0;
            int intValue = b10 != null ? b10.intValue() : 0;
            if (intValue != Integer.MAX_VALUE) {
                i10 = intValue + 1;
            }
            e(str, i10);
            this.f27630a.setTransactionSuccessful();
            return intValue;
        } finally {
            this.f27630a.endTransaction();
        }
    }

    private void e(String str, int i10) {
        this.f27630a.h().a(new l1.d(str, i10));
    }

    public int b() {
        int c10;
        synchronized (c.class) {
            c10 = c("next_alarm_manager_id");
        }
        return c10;
    }

    public int d(int i10, int i11) {
        synchronized (c.class) {
            int c10 = c("next_job_scheduler_id");
            if (c10 >= i10 && c10 <= i11) {
                i10 = c10;
            }
            e("next_job_scheduler_id", i10 + 1);
        }
        return i10;
    }
}
