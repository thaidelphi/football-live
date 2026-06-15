package com.google.protobuf;

import com.google.protobuf.Internal;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public enum NullValue implements Internal.EnumLite {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);
    
    public static final int NULL_VALUE_VALUE = 0;
    private static final Internal.EnumLiteMap<NullValue> internalValueMap = new Internal.EnumLiteMap<NullValue>() { // from class: com.google.protobuf.NullValue.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* renamed from: a */
        public NullValue findValueByNumber(int i10) {
            return NullValue.forNumber(i10);
        }
    };
    private final int value;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    private static final class b implements Internal.EnumVerifier {

        /* renamed from: a  reason: collision with root package name */
        static final Internal.EnumVerifier f15369a = new b();

        private b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i10) {
            return NullValue.forNumber(i10) != null;
        }
    }

    NullValue(int i10) {
        this.value = i10;
    }

    public static NullValue forNumber(int i10) {
        if (i10 != 0) {
            return null;
        }
        return NULL_VALUE;
    }

    public static Internal.EnumLiteMap<NullValue> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f15369a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static NullValue valueOf(int i10) {
        return forNumber(i10);
    }
}
