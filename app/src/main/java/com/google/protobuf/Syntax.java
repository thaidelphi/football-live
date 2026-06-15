package com.google.protobuf;

import com.google.protobuf.Internal;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public enum Syntax implements Internal.EnumLite {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    UNRECOGNIZED(-1);
    
    public static final int SYNTAX_PROTO2_VALUE = 0;
    public static final int SYNTAX_PROTO3_VALUE = 1;
    private static final Internal.EnumLiteMap<Syntax> internalValueMap = new Internal.EnumLiteMap<Syntax>() { // from class: com.google.protobuf.Syntax.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* renamed from: a */
        public Syntax findValueByNumber(int i10) {
            return Syntax.forNumber(i10);
        }
    };
    private final int value;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    private static final class b implements Internal.EnumVerifier {

        /* renamed from: a  reason: collision with root package name */
        static final Internal.EnumVerifier f15380a = new b();

        private b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i10) {
            return Syntax.forNumber(i10) != null;
        }
    }

    Syntax(int i10) {
        this.value = i10;
    }

    public static Syntax forNumber(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                return null;
            }
            return SYNTAX_PROTO3;
        }
        return SYNTAX_PROTO2;
    }

    public static Internal.EnumLiteMap<Syntax> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f15380a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static Syntax valueOf(int i10) {
        return forNumber(i10);
    }
}
