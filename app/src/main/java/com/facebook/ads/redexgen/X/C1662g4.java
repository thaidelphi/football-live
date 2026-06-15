package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.g4  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1662g4 {
    public long A00;
    public long A01;
    public long A02;
    public final ThreadLocal<Long> A03 = new ThreadLocal<>();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final synchronized long A06(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.A01 != -9223372036854775807L) {
            long A01 = A01(this.A01);
            long j11 = (4294967296L + A01) / 8589934592L;
            long j12 = ((j11 - 1) * 8589934592L) + j10;
            long j13 = (8589934592L * j11) + j10;
            if (Math.abs(j12 - A01) >= Math.abs(j13 - A01)) {
                j12 = j13;
            }
            j10 = j12;
        }
        return A05(A00(j10));
    }

    public C1662g4(long j10) {
        A07(j10);
    }

    public static long A00(long j10) {
        return (1000000 * j10) / 90000;
    }

    public static long A01(long j10) {
        return (90000 * j10) / 1000000;
    }

    public final synchronized long A02() {
        long j10;
        if (this.A00 != Long.MAX_VALUE && this.A00 != 9223372036854775806L) {
            j10 = this.A00;
        }
        j10 = -9223372036854775807L;
        return j10;
    }

    public final synchronized long A03() {
        long A02;
        if (this.A01 != -9223372036854775807L) {
            A02 = this.A01 + this.A02;
        } else {
            A02 = A02();
        }
        return A02;
    }

    public final synchronized long A04() {
        return this.A02;
    }

    public final synchronized long A05(long j10) {
        long desiredSampleTimestampUs;
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.A02 == -9223372036854775807L) {
            if (this.A00 == 9223372036854775806L) {
                desiredSampleTimestampUs = ((Long) AbstractC1589es.A01(this.A03.get())).longValue();
            } else {
                desiredSampleTimestampUs = this.A00;
            }
            this.A02 = desiredSampleTimestampUs - j10;
            notifyAll();
        }
        this.A01 = j10;
        return this.A02 + j10;
    }

    public final synchronized void A07(long j10) {
        this.A00 = j10;
        this.A02 = j10 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.A01 = -9223372036854775807L;
    }
}
