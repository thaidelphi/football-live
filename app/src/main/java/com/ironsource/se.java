package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public enum se {
    SendEvent(0),
    NativeController(1);
    

    /* renamed from: b  reason: collision with root package name */
    public static final a f20649b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final int f20653a;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final se a(int i10) {
            se seVar;
            se[] values = se.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    seVar = null;
                    break;
                }
                seVar = values[i11];
                if (seVar.b() == i10) {
                    break;
                }
                i11++;
            }
            return seVar == null ? se.SendEvent : seVar;
        }
    }

    se(int i10) {
        this.f20653a = i10;
    }

    public final int b() {
        return this.f20653a;
    }
}
