package c6;

import com.google.android.gms.common.internal.Preconditions;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class j extends Exception {
    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public j() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str) {
        super(str);
        Preconditions.h(str, "Detail message must not be empty");
    }
}
