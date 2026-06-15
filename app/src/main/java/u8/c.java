package u8;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MathJVM.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class c extends b {
    public static int a(double d10) {
        if (Double.isNaN(d10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return d10 > 2.147483647E9d ? Api.BaseClientBuilder.API_PRIORITY_OTHER : d10 < -2.147483648E9d ? RecyclerView.UNDEFINED_DURATION : (int) Math.round(d10);
    }

    public static int b(float f10) {
        if (Float.isNaN(f10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f10);
    }
}
