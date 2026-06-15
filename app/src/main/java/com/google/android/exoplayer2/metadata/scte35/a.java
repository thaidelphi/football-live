package com.google.android.exoplayer2.metadata.scte35;

import a5.b0;
import a5.c0;
import a5.l0;
import com.google.android.exoplayer2.metadata.Metadata;
import java.nio.ByteBuffer;
import y3.d;
import y3.f;
/* compiled from: SpliceInfoDecoder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    private final c0 f10647a = new c0();

    /* renamed from: b  reason: collision with root package name */
    private final b0 f10648b = new b0();

    /* renamed from: c  reason: collision with root package name */
    private l0 f10649c;

    @Override // y3.f
    protected Metadata b(d dVar, ByteBuffer byteBuffer) {
        l0 l0Var = this.f10649c;
        if (l0Var == null || dVar.f33055i != l0Var.e()) {
            l0 l0Var2 = new l0(dVar.f30093e);
            this.f10649c = l0Var2;
            l0Var2.a(dVar.f30093e - dVar.f33055i);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.f10647a.I(array, limit);
        this.f10648b.n(array, limit);
        this.f10648b.q(39);
        long h10 = (this.f10648b.h(1) << 32) | this.f10648b.h(32);
        this.f10648b.q(20);
        int h11 = this.f10648b.h(12);
        int h12 = this.f10648b.h(8);
        Metadata.Entry entry = null;
        this.f10647a.L(14);
        if (h12 == 0) {
            entry = new SpliceNullCommand();
        } else if (h12 == 255) {
            entry = PrivateCommand.a(this.f10647a, h11, h10);
        } else if (h12 == 4) {
            entry = SpliceScheduleCommand.a(this.f10647a);
        } else if (h12 == 5) {
            entry = SpliceInsertCommand.a(this.f10647a, h10, this.f10649c);
        } else if (h12 == 6) {
            entry = TimeSignalCommand.a(this.f10647a, h10, this.f10649c);
        }
        return entry == null ? new Metadata(new Metadata.Entry[0]) : new Metadata(entry);
    }
}
