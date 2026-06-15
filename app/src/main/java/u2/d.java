package u2;

import x2.f;
import y2.g;
import y2.h;
import y2.i;
import y2.j;
import y2.k;
import y2.l;
import y2.m;
import y2.n;
import y2.o;
/* compiled from: SpriteFactory.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class d {

    /* compiled from: SpriteFactory.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f31320a;

        static {
            int[] iArr = new int[e.values().length];
            f31320a = iArr;
            try {
                iArr[e.ROTATING_PLANE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31320a[e.DOUBLE_BOUNCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31320a[e.WAVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31320a[e.WANDERING_CUBES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31320a[e.PULSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31320a[e.CHASING_DOTS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31320a[e.THREE_BOUNCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f31320a[e.CIRCLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f31320a[e.CUBE_GRID.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f31320a[e.FADING_CIRCLE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f31320a[e.FOLDING_CUBE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f31320a[e.ROTATING_CIRCLE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f31320a[e.MULTIPLE_PULSE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f31320a[e.PULSE_RING.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f31320a[e.MULTIPLE_PULSE_RING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    public static f a(e eVar) {
        switch (a.f31320a[eVar.ordinal()]) {
            case 1:
                return new l();
            case 2:
                return new y2.d();
            case 3:
                return new o();
            case 4:
                return new n();
            case 5:
                return new i();
            case 6:
                return new y2.a();
            case 7:
                return new m();
            case 8:
                return new y2.b();
            case 9:
                return new y2.c();
            case 10:
                return new y2.e();
            case 11:
                return new y2.f();
            case 12:
                return new k();
            case 13:
                return new g();
            case 14:
                return new j();
            case 15:
                return new h();
            default:
                return null;
        }
    }
}
