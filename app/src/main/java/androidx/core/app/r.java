package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: TaskStackBuilder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class r implements Iterable<Intent> {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<Intent> f2548a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private final Context f2549b;

    /* compiled from: TaskStackBuilder.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        Intent getSupportParentActivityIntent();
    }

    private r(Context context) {
        this.f2549b = context;
    }

    public static r d(Context context) {
        return new r(context);
    }

    public r a(Intent intent) {
        this.f2548a.add(intent);
        return this;
    }

    public r b(Activity activity) {
        Intent supportParentActivityIntent = activity instanceof a ? ((a) activity).getSupportParentActivityIntent() : null;
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = h.a(activity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.f2549b.getPackageManager());
            }
            c(component);
            a(supportParentActivityIntent);
        }
        return this;
    }

    public r c(ComponentName componentName) {
        int size = this.f2548a.size();
        try {
            Intent b10 = h.b(this.f2549b, componentName);
            while (b10 != null) {
                this.f2548a.add(size, b10);
                b10 = h.b(this.f2549b, b10.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e8) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e8);
        }
    }

    public void e() {
        f(null);
    }

    public void f(Bundle bundle) {
        if (!this.f2548a.isEmpty()) {
            Intent[] intentArr = (Intent[]) this.f2548a.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (androidx.core.content.a.i(this.f2549b, intentArr, bundle)) {
                return;
            }
            Intent intent = new Intent(intentArr[intentArr.length - 1]);
            intent.addFlags(268435456);
            this.f2549b.startActivity(intent);
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f2548a.iterator();
    }
}
