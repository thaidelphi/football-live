package q3;

import a5.p0;
/* compiled from: DecoderCounters.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public int f30078a;

    /* renamed from: b  reason: collision with root package name */
    public int f30079b;

    /* renamed from: c  reason: collision with root package name */
    public int f30080c;

    /* renamed from: d  reason: collision with root package name */
    public int f30081d;

    /* renamed from: e  reason: collision with root package name */
    public int f30082e;

    /* renamed from: f  reason: collision with root package name */
    public int f30083f;

    /* renamed from: g  reason: collision with root package name */
    public int f30084g;

    /* renamed from: h  reason: collision with root package name */
    public int f30085h;

    /* renamed from: i  reason: collision with root package name */
    public int f30086i;

    /* renamed from: j  reason: collision with root package name */
    public int f30087j;

    /* renamed from: k  reason: collision with root package name */
    public long f30088k;

    /* renamed from: l  reason: collision with root package name */
    public int f30089l;

    private void b(long j10, int i10) {
        this.f30088k += j10;
        this.f30089l += i10;
    }

    public void a(long j10) {
        b(j10, 1);
    }

    public synchronized void c() {
    }

    public String toString() {
        return p0.B("DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n}", Integer.valueOf(this.f30078a), Integer.valueOf(this.f30079b), Integer.valueOf(this.f30080c), Integer.valueOf(this.f30081d), Integer.valueOf(this.f30082e), Integer.valueOf(this.f30083f), Integer.valueOf(this.f30084g), Integer.valueOf(this.f30085h), Integer.valueOf(this.f30086i), Integer.valueOf(this.f30087j), Long.valueOf(this.f30088k), Integer.valueOf(this.f30089l));
    }
}
