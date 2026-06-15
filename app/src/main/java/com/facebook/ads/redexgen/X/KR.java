package com.facebook.ads.redexgen.X;

import android.media.AudioManager;
import java.lang.ref.WeakReference;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class KR extends AbstractC1415c3 {
    public static byte[] A01;
    public static String[] A02 = {"QO", "Z8VzzUk48H2MjHputsbFKGrTuA", "oizJfYv64JjjPWcjk8h6rnHMPSWYW3KU", "f0BEY4eTEaDQ97bHAlskleks6ilDfv7w", "kzTTWWoLyKzhVsFKHFAAxGaFMysI7iP7", "O5", "DqVK5n8IQlswAJl59jQWGsTS7h", "g8gXhMPhSk6l7LNUsVLjaHR4ALnMtBc"};
    public final /* synthetic */ KO A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A02;
            if (strArr[5].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            A02[3] = "zGtxq0LnznDpkAI9fIogelgluQXN9rJC";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 108);
            i13++;
        }
    }

    public static void A01() {
        A01 = new byte[]{7, 19, 2, 15, 9};
    }

    static {
        A01();
    }

    public KR(KO ko) {
        this.A00 = ko;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C9K
    /* renamed from: A02 */
    public final void A03(C0897Ka c0897Ka) {
        WeakReference weakReference;
        WeakReference weakReference2;
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener;
        AudioManager audioManager = (AudioManager) this.A00.getContext().getApplicationContext().getSystemService(A00(0, 5, 10));
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
