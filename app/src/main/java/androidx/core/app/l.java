package androidx.core.app;

import android.app.Notification;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.app.j;
import androidx.core.graphics.drawable.IconCompat;
import com.ironsource.b9;
import java.lang.reflect.Field;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NotificationCompatJellybean.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class l {

    /* renamed from: b  reason: collision with root package name */
    private static Field f2526b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f2527c;

    /* renamed from: a  reason: collision with root package name */
    private static final Object f2525a = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static final Object f2528d = new Object();

    public static SparseArray<Bundle> a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            Bundle bundle = list.get(i10);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i10, bundle);
            }
        }
        return sparseArray;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Bundle b(j.a aVar) {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        IconCompat e8 = aVar.e();
        bundle2.putInt(b9.h.H0, e8 != null ? e8.j() : 0);
        bundle2.putCharSequence(b9.h.D0, aVar.i());
        bundle2.putParcelable("actionIntent", aVar.a());
        if (aVar.d() != null) {
            bundle = new Bundle(aVar.d());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle2.putBundle("extras", bundle);
        bundle2.putParcelableArray("remoteInputs", e(aVar.f()));
        bundle2.putBoolean("showsUserInterface", aVar.h());
        bundle2.putInt("semanticAction", aVar.g());
        return bundle2;
    }

    public static Bundle c(Notification notification) {
        synchronized (f2525a) {
            if (f2527c) {
                return null;
            }
            try {
                if (f2526b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        f2527c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f2526b = declaredField;
                }
                Bundle bundle = (Bundle) f2526b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f2526b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e8) {
                Log.e("NotificationCompat", "Unable to access notification extras", e8);
                f2527c = true;
                return null;
            } catch (NoSuchFieldException e10) {
                Log.e("NotificationCompat", "Unable to access notification extras", e10);
                f2527c = true;
                return null;
            }
        }
    }

    private static Bundle d(p pVar) {
        new Bundle();
        throw null;
    }

    private static Bundle[] e(p[] pVarArr) {
        if (pVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[pVarArr.length];
        for (int i10 = 0; i10 < pVarArr.length; i10++) {
            bundleArr[i10] = d(pVarArr[i10]);
        }
        return bundleArr;
    }

    public static Bundle f(Notification.Builder builder, j.a aVar) {
        IconCompat e8 = aVar.e();
        builder.addAction(e8 != null ? e8.j() : 0, aVar.i(), aVar.a());
        Bundle bundle = new Bundle(aVar.d());
        if (aVar.f() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", e(aVar.f()));
        }
        if (aVar.c() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", e(aVar.c()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        return bundle;
    }
}
