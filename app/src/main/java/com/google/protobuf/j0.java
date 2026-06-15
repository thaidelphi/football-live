package com.google.protobuf;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RawMessageInfo.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class j0 implements w {

    /* renamed from: a  reason: collision with root package name */
    private final MessageLite f15436a;

    /* renamed from: b  reason: collision with root package name */
    private final String f15437b;

    /* renamed from: c  reason: collision with root package name */
    private final Object[] f15438c;

    /* renamed from: d  reason: collision with root package name */
    private final int f15439d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j0(MessageLite messageLite, String str, Object[] objArr) {
        this.f15436a = messageLite;
        this.f15437b = str;
        this.f15438c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f15439d = charAt;
            return;
        }
        int i10 = charAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char charAt2 = str.charAt(i12);
            if (charAt2 < 55296) {
                this.f15439d = i10 | (charAt2 << i11);
                return;
            }
            i10 |= (charAt2 & 8191) << i11;
            i11 += 13;
            i12 = i13;
        }
    }

    @Override // com.google.protobuf.w
    public boolean a() {
        return (this.f15439d & 2) == 2;
    }

    @Override // com.google.protobuf.w
    public MessageLite b() {
        return this.f15436a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object[] c() {
        return this.f15438c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String d() {
        return this.f15437b;
    }

    @Override // com.google.protobuf.w
    public ProtoSyntax getSyntax() {
        return (this.f15439d & 1) == 1 ? ProtoSyntax.PROTO2 : ProtoSyntax.PROTO3;
    }
}
