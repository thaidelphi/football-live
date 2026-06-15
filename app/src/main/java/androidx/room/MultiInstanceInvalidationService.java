package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.r;
import java.util.HashMap;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class MultiInstanceInvalidationService extends Service {

    /* renamed from: a  reason: collision with root package name */
    int f4142a = 0;

    /* renamed from: b  reason: collision with root package name */
    final HashMap<Integer, String> f4143b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    final RemoteCallbackList<q> f4144c = new a();

    /* renamed from: d  reason: collision with root package name */
    private final r.a f4145d = new b();

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends RemoteCallbackList<q> {
        a() {
        }

        @Override // android.os.RemoteCallbackList
        /* renamed from: a */
        public void onCallbackDied(q qVar, Object obj) {
            MultiInstanceInvalidationService.this.f4143b.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class b extends r.a {
        b() {
        }

        @Override // androidx.room.r
        public int O(q qVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f4144c) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i10 = multiInstanceInvalidationService.f4142a + 1;
                multiInstanceInvalidationService.f4142a = i10;
                if (multiInstanceInvalidationService.f4144c.register(qVar, Integer.valueOf(i10))) {
                    MultiInstanceInvalidationService.this.f4143b.put(Integer.valueOf(i10), str);
                    return i10;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                multiInstanceInvalidationService2.f4142a--;
                return 0;
            }
        }

        @Override // androidx.room.r
        public void r0(q qVar, int i10) {
            synchronized (MultiInstanceInvalidationService.this.f4144c) {
                MultiInstanceInvalidationService.this.f4144c.unregister(qVar);
                MultiInstanceInvalidationService.this.f4143b.remove(Integer.valueOf(i10));
            }
        }

        @Override // androidx.room.r
        public void z(int i10, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f4144c) {
                String str = MultiInstanceInvalidationService.this.f4143b.get(Integer.valueOf(i10));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = MultiInstanceInvalidationService.this.f4144c.beginBroadcast();
                for (int i11 = 0; i11 < beginBroadcast; i11++) {
                    int intValue = ((Integer) MultiInstanceInvalidationService.this.f4144c.getBroadcastCookie(i11)).intValue();
                    String str2 = MultiInstanceInvalidationService.this.f4143b.get(Integer.valueOf(intValue));
                    if (i10 != intValue && str.equals(str2)) {
                        try {
                            MultiInstanceInvalidationService.this.f4144c.getBroadcastItem(i11).f(strArr);
                        } catch (RemoteException e8) {
                            Log.w("ROOM", "Error invoking a remote callback", e8);
                        }
                    }
                }
                MultiInstanceInvalidationService.this.f4144c.finishBroadcast();
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f4145d;
    }
}
