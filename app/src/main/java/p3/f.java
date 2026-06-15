package p3;

import a5.p0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.provider.Settings;
import android.util.Pair;
import com.ironsource.b9;
import java.util.Arrays;
import n3.m1;
import y5.q;
import y5.r;
import y5.s0;
/* compiled from: AudioCapabilities.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class f {

    /* renamed from: c  reason: collision with root package name */
    public static final f f29675c = new f(new int[]{2}, 8);

    /* renamed from: d  reason: collision with root package name */
    private static final f f29676d = new f(new int[]{2, 5, 6}, 8);

    /* renamed from: e  reason: collision with root package name */
    private static final y5.r<Integer, Integer> f29677e = new r.a().f(5, 6).f(17, 6).f(7, 6).f(18, 6).f(6, 8).f(8, 8).f(14, 8).c();

    /* renamed from: a  reason: collision with root package name */
    private final int[] f29678a;

    /* renamed from: b  reason: collision with root package name */
    private final int f29679b;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AudioCapabilities.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private static final AudioAttributes f29680a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

        public static int[] a() {
            q.a j10 = y5.q.j();
            s0 it = f.f29677e.keySet().iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), f29680a)) {
                    j10.a(Integer.valueOf(intValue));
                }
            }
            j10.a(2);
            return a6.b.k(j10.h());
        }

        public static int b(int i10, int i11) {
            for (int i12 = 8; i12 > 0; i12--) {
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(p0.F(i12)).build(), f29680a)) {
                    return i12;
                }
            }
            return 0;
        }
    }

    public f(int[] iArr, int i10) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f29678a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f29678a = new int[0];
        }
        this.f29679b = i10;
    }

    private static boolean b() {
        if (p0.f482a >= 17) {
            String str = p0.f484c;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static f c(Context context) {
        return d(context, p0.M0(context, null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    @SuppressLint({"InlinedApi"})
    static f d(Context context, Intent intent) {
        if (b() && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
            return f29676d;
        }
        if (p0.f482a >= 29 && (p0.x0(context) || p0.s0(context))) {
            return new f(a.a(), 8);
        }
        if (intent != null && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 0) {
            return new f(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
        }
        return f29675c;
    }

    private static int e(int i10) {
        int i11 = p0.f482a;
        if (i11 <= 28) {
            if (i10 == 7) {
                i10 = 8;
            } else if (i10 == 3 || i10 == 4 || i10 == 5) {
                i10 = 6;
            }
        }
        if (i11 <= 26 && "fugu".equals(p0.f483b) && i10 == 1) {
            i10 = 2;
        }
        return p0.F(i10);
    }

    private static int g(int i10, int i11) {
        if (p0.f482a >= 29) {
            return a.b(i10, i11);
        }
        return ((Integer) a5.a.e(f29677e.getOrDefault(Integer.valueOf(i10), 0))).intValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return Arrays.equals(this.f29678a, fVar.f29678a) && this.f29679b == fVar.f29679b;
        }
        return false;
    }

    public Pair<Integer, Integer> f(m1 m1Var) {
        int f10 = a5.x.f((String) a5.a.e(m1Var.f28185l), m1Var.f28182i);
        if (f29677e.containsKey(Integer.valueOf(f10))) {
            if (f10 == 18 && !i(18)) {
                f10 = 6;
            } else if (f10 == 8 && !i(8)) {
                f10 = 7;
            }
            if (i(f10)) {
                int i10 = m1Var.f28198y;
                if (i10 != -1 && f10 != 18) {
                    if (i10 > this.f29679b) {
                        return null;
                    }
                } else {
                    int i11 = m1Var.f28199z;
                    if (i11 == -1) {
                        i11 = 48000;
                    }
                    i10 = g(f10, i11);
                }
                int e8 = e(i10);
                if (e8 == 0) {
                    return null;
                }
                return Pair.create(Integer.valueOf(f10), Integer.valueOf(e8));
            }
            return null;
        }
        return null;
    }

    public boolean h(m1 m1Var) {
        return f(m1Var) != null;
    }

    public int hashCode() {
        return this.f29679b + (Arrays.hashCode(this.f29678a) * 31);
    }

    public boolean i(int i10) {
        return Arrays.binarySearch(this.f29678a, i10) >= 0;
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f29679b + ", supportedEncodings=" + Arrays.toString(this.f29678a) + b9.i.f16698e;
    }
}
