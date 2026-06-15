package androidx.core.app;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Bundle;
/* compiled from: RemoteInput.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class p {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RemoteInput.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a {
        static void a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        public static RemoteInput b(p pVar) {
            throw null;
        }

        static Bundle c(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    static RemoteInput a(p pVar) {
        return a.b(pVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static RemoteInput[] b(p[] pVarArr) {
        if (pVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[pVarArr.length];
        for (int i10 = 0; i10 < pVarArr.length; i10++) {
            remoteInputArr[i10] = a(pVarArr[i10]);
        }
        return remoteInputArr;
    }
}
