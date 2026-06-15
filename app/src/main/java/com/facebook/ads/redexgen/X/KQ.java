package com.facebook.ads.redexgen.X;

import android.media.AudioManager;
import java.lang.ref.WeakReference;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class KQ extends AbstractC1409bx {
    public static byte[] A01;
    public final /* synthetic */ KO A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 103);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{90, 78, 95, 82, 84};
    }

    public KQ(KO ko) {
        this.A00 = ko;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C9K
    /* renamed from: A02 */
    public final void A03(KY ky) {
        WeakReference weakReference;
        WeakReference weakReference2;
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener;
        AudioManager audioManager = (AudioManager) this.A00.getContext().getApplicationContext().getSystemService(A00(0, 5, 92));
        weakReference = this.A00.A00;
        if (weakReference == null) {
            onAudioFocusChangeListener = null;
        } else {
            weakReference2 = this.A00.A00;
            onAudioFocusChangeListener = (AudioManager.OnAudioFocusChangeListener) weakReference2.get();
        }
        audioManager.abandonAudioFocus(onAudioFocusChangeListener);
    }
}
