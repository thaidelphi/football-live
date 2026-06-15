package androidx.media;

import androidx.versionedparcelable.a;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f3711a = aVar.p(audioAttributesImplBase.f3711a, 1);
        audioAttributesImplBase.f3712b = aVar.p(audioAttributesImplBase.f3712b, 2);
        audioAttributesImplBase.f3713c = aVar.p(audioAttributesImplBase.f3713c, 3);
        audioAttributesImplBase.f3714d = aVar.p(audioAttributesImplBase.f3714d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, a aVar) {
        aVar.x(false, false);
        aVar.F(audioAttributesImplBase.f3711a, 1);
        aVar.F(audioAttributesImplBase.f3712b, 2);
        aVar.F(audioAttributesImplBase.f3713c, 3);
        aVar.F(audioAttributesImplBase.f3714d, 4);
    }
}
