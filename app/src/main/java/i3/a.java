package i3;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
/* compiled from: AlarmManagerScheduler.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class a implements y {

    /* renamed from: a  reason: collision with root package name */
    private final Context f26431a;

    /* renamed from: b  reason: collision with root package name */
    private final j3.d f26432b;

    /* renamed from: c  reason: collision with root package name */
    private AlarmManager f26433c;

    /* renamed from: d  reason: collision with root package name */
    private final g f26434d;

    /* renamed from: e  reason: collision with root package name */
    private final l3.a f26435e;

    public a(Context context, j3.d dVar, l3.a aVar, g gVar) {
        this(context, dVar, (AlarmManager) context.getSystemService("alarm"), aVar, gVar);
    }

    @Override // i3.y
    public void a(b3.o oVar, int i10) {
        b(oVar, i10, false);
    }

    @Override // i3.y
    public void b(b3.o oVar, int i10, boolean z10) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", oVar.b());
        builder.appendQueryParameter(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, String.valueOf(m3.a.a(oVar.d())));
        if (oVar.c() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(oVar.c(), 0));
        }
        Intent intent = new Intent(this.f26431a, AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i10);
        if (!z10 && c(intent)) {
            f3.a.b("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", oVar);
            return;
        }
        long g02 = this.f26432b.g0(oVar);
        long g10 = this.f26434d.g(oVar.d(), g02, i10);
        f3.a.c("AlarmManagerScheduler", "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", oVar, Long.valueOf(g10), Long.valueOf(g02), Integer.valueOf(i10));
        this.f26433c.set(3, this.f26435e.a() + g10, PendingIntent.getBroadcast(this.f26431a, 0, intent, Build.VERSION.SDK_INT >= 23 ? 67108864 : 0));
    }

    boolean c(Intent intent) {
        return PendingIntent.getBroadcast(this.f26431a, 0, intent, Build.VERSION.SDK_INT >= 23 ? 603979776 : 536870912) != null;
    }

    a(Context context, j3.d dVar, AlarmManager alarmManager, l3.a aVar, g gVar) {
        this.f26431a = context;
        this.f26432b = dVar;
        this.f26433c = alarmManager;
        this.f26435e = aVar;
        this.f26434d = gVar;
    }
}
