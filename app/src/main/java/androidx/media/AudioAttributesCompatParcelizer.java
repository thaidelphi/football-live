package androidx.media;

import androidx.versionedparcelable.a;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(a aVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f3706a = (AudioAttributesImpl) aVar.v(audioAttributesCompat.f3706a, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, a aVar) {
        aVar.x(false, false);
        aVar.M(audioAttributesCompat.f3706a, 1);
    }
}
