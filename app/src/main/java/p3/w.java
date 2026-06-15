package p3;

import a5.p0;
import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
/* compiled from: AudioTimestampPoller.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class w {

    /* renamed from: a  reason: collision with root package name */
    private final a f29799a;

    /* renamed from: b  reason: collision with root package name */
    private int f29800b;

    /* renamed from: c  reason: collision with root package name */
    private long f29801c;

    /* renamed from: d  reason: collision with root package name */
    private long f29802d;

    /* renamed from: e  reason: collision with root package name */
    private long f29803e;

    /* renamed from: f  reason: collision with root package name */
    private long f29804f;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AudioTimestampPoller.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final AudioTrack f29805a;

        /* renamed from: b  reason: collision with root package name */
        private final AudioTimestamp f29806b = new AudioTimestamp();

        /* renamed from: c  reason: collision with root package name */
        private long f29807c;

        /* renamed from: d  reason: collision with root package name */
        private long f29808d;

        /* renamed from: e  reason: collision with root package name */
        private long f29809e;

        public a(AudioTrack audioTrack) {
            this.f29805a = audioTrack;
        }

        public long a() {
            return this.f29809e;
        }

        public long b() {
            return this.f29806b.nanoTime / 1000;
        }

        public boolean c() {
            boolean timestamp = this.f29805a.getTimestamp(this.f29806b);
            if (timestamp) {
                long j10 = this.f29806b.framePosition;
                if (this.f29808d > j10) {
                    this.f29807c++;
                }
                this.f29808d = j10;
                this.f29809e = j10 + (this.f29807c << 32);
            }
            return timestamp;
        }
    }

    public w(AudioTrack audioTrack) {
        if (p0.f482a >= 19) {
            this.f29799a = new a(audioTrack);
            g();
            return;
        }
        this.f29799a = null;
        h(3);
    }

    private void h(int i10) {
        this.f29800b = i10;
        if (i10 == 0) {
            this.f29803e = 0L;
            this.f29804f = -1L;
            this.f29801c = System.nanoTime() / 1000;
            this.f29802d = 10000L;
        } else if (i10 == 1) {
            this.f29802d = 10000L;
        } else if (i10 == 2 || i10 == 3) {
            this.f29802d = 10000000L;
        } else if (i10 == 4) {
            this.f29802d = 500000L;
        } else {
            throw new IllegalStateException();
        }
    }

    public void a() {
        if (this.f29800b == 4) {
            g();
        }
    }

    @TargetApi(19)
    public long b() {
        a aVar = this.f29799a;
        if (aVar != null) {
            return aVar.a();
        }
        return -1L;
    }

    @TargetApi(19)
    public long c() {
        a aVar = this.f29799a;
        if (aVar != null) {
            return aVar.b();
        }
        return -9223372036854775807L;
    }

    public boolean d() {
        return this.f29800b == 2;
    }

    @TargetApi(19)
    public boolean e(long j10) {
        a aVar = this.f29799a;
        if (aVar == null || j10 - this.f29803e < this.f29802d) {
            return false;
        }
        this.f29803e = j10;
        boolean c10 = aVar.c();
        int i10 = this.f29800b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (c10) {
                        g();
                    }
                } else if (!c10) {
                    g();
                }
            } else if (c10) {
                if (this.f29799a.a() > this.f29804f) {
                    h(2);
                }
            } else {
                g();
            }
        } else if (c10) {
            if (this.f29799a.b() < this.f29801c) {
                return false;
            }
            this.f29804f = this.f29799a.a();
            h(1);
        } else if (j10 - this.f29801c > 500000) {
            h(3);
        }
        return c10;
    }

    public void f() {
        h(4);
    }

    public void g() {
        if (this.f29799a != null) {
            h(0);
        }
    }
}
