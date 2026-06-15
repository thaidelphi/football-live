package e9;

import android.os.Looper;
import d9.k2;
import i9.y;
import java.util.List;
/* compiled from: HandlerDispatcher.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class a implements y {
    @Override // i9.y
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // i9.y
    public k2 b(List<? extends y> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new d(f.a(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // i9.y
    public int c() {
        return 1073741823;
    }
}
