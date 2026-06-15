package androidx.media;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesImpl;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a  reason: collision with root package name */
    public AudioAttributes f3708a;

    /* renamed from: b  reason: collision with root package name */
    public int f3709b;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class a implements AudioAttributesImpl.a {

        /* renamed from: a  reason: collision with root package name */
        final AudioAttributes.Builder f3710a = new AudioAttributes.Builder();

        @Override // androidx.media.AudioAttributesImpl.a
        /* renamed from: b */
        public a a(int i10) {
            this.f3710a.setLegacyStreamType(i10);
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.a
        public AudioAttributesImpl build() {
            return new AudioAttributesImplApi21(this.f3710a.build());
        }
    }

    public AudioAttributesImplApi21() {
        this.f3709b = -1;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f3708a.equals(((AudioAttributesImplApi21) obj).f3708a);
        }
        return false;
    }

    public int hashCode() {
        return this.f3708a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f3708a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AudioAttributesImplApi21(AudioAttributes audioAttributes, int i10) {
        this.f3709b = -1;
        this.f3708a = audioAttributes;
        this.f3709b = i10;
    }
}
