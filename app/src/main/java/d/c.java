package d;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: ActivityResultContracts.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class c extends d.a<Intent, ActivityResult> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f23871a = new a(null);

    /* compiled from: ActivityResultContracts.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    @Override // d.a
    /* renamed from: d */
    public Intent a(Context context, Intent input) {
        n.f(context, "context");
        n.f(input, "input");
        return input;
    }

    @Override // d.a
    /* renamed from: e */
    public ActivityResult c(int i10, Intent intent) {
        return new ActivityResult(i10, intent);
    }
}
