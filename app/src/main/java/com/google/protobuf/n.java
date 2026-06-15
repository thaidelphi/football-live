package com.google.protobuf;
/* compiled from: GeneratedMessageInfoFactory.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
class n implements x {

    /* renamed from: a  reason: collision with root package name */
    private static final n f15465a = new n();

    private n() {
    }

    public static n c() {
        return f15465a;
    }

    @Override // com.google.protobuf.x
    public w a(Class<?> cls) {
        if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            try {
                return (w) GeneratedMessageLite.getDefaultInstance(cls.asSubclass(GeneratedMessageLite.class)).buildMessageInfo();
            } catch (Exception e8) {
                throw new RuntimeException("Unable to get message info for " + cls.getName(), e8);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
    }

    @Override // com.google.protobuf.x
    public boolean b(Class<?> cls) {
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }
}
