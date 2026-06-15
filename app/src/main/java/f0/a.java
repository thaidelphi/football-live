package f0;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
/* compiled from: ExifInterface.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class a {
    private static SimpleDateFormat W;

    /* renamed from: a0  reason: collision with root package name */
    private static final d[] f25204a0;

    /* renamed from: b0  reason: collision with root package name */
    private static final d[] f25205b0;

    /* renamed from: c0  reason: collision with root package name */
    private static final d[] f25206c0;

    /* renamed from: d0  reason: collision with root package name */
    private static final d[] f25207d0;

    /* renamed from: e0  reason: collision with root package name */
    private static final d[] f25208e0;

    /* renamed from: f0  reason: collision with root package name */
    private static final d f25209f0;

    /* renamed from: g0  reason: collision with root package name */
    private static final d[] f25210g0;

    /* renamed from: h0  reason: collision with root package name */
    private static final d[] f25211h0;

    /* renamed from: i0  reason: collision with root package name */
    private static final d[] f25212i0;

    /* renamed from: j0  reason: collision with root package name */
    private static final d[] f25213j0;

    /* renamed from: k0  reason: collision with root package name */
    static final d[][] f25214k0;

    /* renamed from: l0  reason: collision with root package name */
    private static final d[] f25215l0;

    /* renamed from: m0  reason: collision with root package name */
    private static final d f25216m0;

    /* renamed from: n0  reason: collision with root package name */
    private static final d f25217n0;

    /* renamed from: o0  reason: collision with root package name */
    private static final HashMap<Integer, d>[] f25218o0;

    /* renamed from: p0  reason: collision with root package name */
    private static final HashMap<String, d>[] f25219p0;

    /* renamed from: q0  reason: collision with root package name */
    private static final HashSet<String> f25220q0;

    /* renamed from: r0  reason: collision with root package name */
    private static final HashMap<Integer, Integer> f25221r0;

    /* renamed from: s0  reason: collision with root package name */
    static final Charset f25222s0;

    /* renamed from: t0  reason: collision with root package name */
    static final byte[] f25223t0;

    /* renamed from: u0  reason: collision with root package name */
    private static final byte[] f25224u0;

    /* renamed from: v0  reason: collision with root package name */
    private static final Pattern f25225v0;

    /* renamed from: w0  reason: collision with root package name */
    private static final Pattern f25227w0;

    /* renamed from: a  reason: collision with root package name */
    private String f25231a;

    /* renamed from: b  reason: collision with root package name */
    private FileDescriptor f25232b;

    /* renamed from: c  reason: collision with root package name */
    private AssetManager.AssetInputStream f25233c;

    /* renamed from: d  reason: collision with root package name */
    private int f25234d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f25235e;

    /* renamed from: f  reason: collision with root package name */
    private final HashMap<String, c>[] f25236f;

    /* renamed from: g  reason: collision with root package name */
    private Set<Integer> f25237g;

    /* renamed from: h  reason: collision with root package name */
    private ByteOrder f25238h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f25239i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f25240j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f25241k;

    /* renamed from: l  reason: collision with root package name */
    private int f25242l;

    /* renamed from: m  reason: collision with root package name */
    private int f25243m;

    /* renamed from: n  reason: collision with root package name */
    private byte[] f25244n;

    /* renamed from: o  reason: collision with root package name */
    private int f25245o;

    /* renamed from: p  reason: collision with root package name */
    private int f25246p;

    /* renamed from: q  reason: collision with root package name */
    private int f25247q;

    /* renamed from: r  reason: collision with root package name */
    private int f25248r;

    /* renamed from: s  reason: collision with root package name */
    private int f25249s;

    /* renamed from: t  reason: collision with root package name */
    private int f25250t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f25251u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f25252v;

    /* renamed from: w  reason: collision with root package name */
    private static final boolean f25226w = Log.isLoggable("ExifInterface", 3);

    /* renamed from: x  reason: collision with root package name */
    private static final List<Integer> f25228x = Arrays.asList(1, 6, 3, 8);

    /* renamed from: y  reason: collision with root package name */
    private static final List<Integer> f25229y = Arrays.asList(2, 7, 4, 5);

    /* renamed from: z  reason: collision with root package name */
    public static final int[] f25230z = {8, 8, 8};
    public static final int[] A = {4};
    public static final int[] B = {8};
    static final byte[] C = {-1, -40, -1};
    private static final byte[] D = {102, 116, 121, 112};
    private static final byte[] E = {109, 105, 102, 49};
    private static final byte[] F = {104, 101, 105, 99};
    private static final byte[] G = {79, 76, 89, 77, 80, 0};
    private static final byte[] H = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    private static final byte[] I = {-119, 80, 78, 71, 13, 10, 26, 10};
    private static final byte[] J = {101, 88, 73, 102};
    private static final byte[] K = {73, 72, 68, 82};
    private static final byte[] L = {73, 69, 78, 68};
    private static final byte[] M = {82, 73, 70, 70};
    private static final byte[] N = {87, 69, 66, 80};
    private static final byte[] O = {69, 88, 73, 70};
    private static final byte[] P = {-99, 1, 42};
    private static final byte[] Q = "VP8X".getBytes(Charset.defaultCharset());
    private static final byte[] R = "VP8L".getBytes(Charset.defaultCharset());
    private static final byte[] S = "VP8 ".getBytes(Charset.defaultCharset());
    private static final byte[] T = "ANIM".getBytes(Charset.defaultCharset());
    private static final byte[] U = "ANMF".getBytes(Charset.defaultCharset());
    private static final byte[] V = "XMP ".getBytes(Charset.defaultCharset());
    static final String[] X = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    static final int[] Y = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    static final byte[] Z = {65, 83, 67, 73, 73, 0, 0, 0};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExifInterface.java */
    /* renamed from: f0.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class C0273a extends MediaDataSource {

        /* renamed from: a  reason: collision with root package name */
        long f25253a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f25254b;

        C0273a(b bVar) {
            this.f25254b = bVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // android.media.MediaDataSource
        public long getSize() throws IOException {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j10, byte[] bArr, int i10, int i11) throws IOException {
            if (i11 == 0) {
                return 0;
            }
            if (j10 < 0) {
                return -1;
            }
            try {
                long j11 = this.f25253a;
                if (j11 != j10) {
                    if (j11 >= 0 && j10 >= j11 + this.f25254b.available()) {
                        return -1;
                    }
                    this.f25254b.j(j10);
                    this.f25253a = j10;
                }
                if (i11 > this.f25254b.available()) {
                    i11 = this.f25254b.available();
                }
                int read = this.f25254b.read(bArr, i10, i11);
                if (read >= 0) {
                    this.f25253a += read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f25253a = -1L;
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ExifInterface.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b extends InputStream implements DataInput {

        /* renamed from: e  reason: collision with root package name */
        private static final ByteOrder f25256e = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: f  reason: collision with root package name */
        private static final ByteOrder f25257f = ByteOrder.BIG_ENDIAN;

        /* renamed from: a  reason: collision with root package name */
        private DataInputStream f25258a;

        /* renamed from: b  reason: collision with root package name */
        private ByteOrder f25259b;

        /* renamed from: c  reason: collision with root package name */
        final int f25260c;

        /* renamed from: d  reason: collision with root package name */
        int f25261d;

        public b(InputStream inputStream) throws IOException {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        public int a() {
            return this.f25260c;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.f25258a.available();
        }

        public int b() {
            return this.f25261d;
        }

        public long f() throws IOException {
            return readInt() & 4294967295L;
        }

        public void j(long j10) throws IOException {
            int i10 = this.f25261d;
            if (i10 > j10) {
                this.f25261d = 0;
                this.f25258a.reset();
                this.f25258a.mark(this.f25260c);
            } else {
                j10 -= i10;
            }
            int i11 = (int) j10;
            if (skipBytes(i11) != i11) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        public void k(ByteOrder byteOrder) {
            this.f25259b = byteOrder;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            this.f25261d++;
            return this.f25258a.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() throws IOException {
            this.f25261d++;
            return this.f25258a.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            int i10 = this.f25261d + 1;
            this.f25261d = i10;
            if (i10 <= this.f25260c) {
                int read = this.f25258a.read();
                if (read >= 0) {
                    return (byte) read;
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() throws IOException {
            this.f25261d += 2;
            return this.f25258a.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.f25261d + i11;
            this.f25261d = i12;
            if (i12 <= this.f25260c) {
                if (this.f25258a.read(bArr, i10, i11) != i11) {
                    throw new IOException("Couldn't read up to the length of buffer");
                }
                return;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            int i10 = this.f25261d + 4;
            this.f25261d = i10;
            if (i10 <= this.f25260c) {
                int read = this.f25258a.read();
                int read2 = this.f25258a.read();
                int read3 = this.f25258a.read();
                int read4 = this.f25258a.read();
                if ((read | read2 | read3 | read4) >= 0) {
                    ByteOrder byteOrder = this.f25259b;
                    if (byteOrder == f25256e) {
                        return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == f25257f) {
                        return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                    }
                    throw new IOException("Invalid byte order: " + this.f25259b);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readLine() throws IOException {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            int i10 = this.f25261d + 8;
            this.f25261d = i10;
            if (i10 <= this.f25260c) {
                int read = this.f25258a.read();
                int read2 = this.f25258a.read();
                int read3 = this.f25258a.read();
                int read4 = this.f25258a.read();
                int read5 = this.f25258a.read();
                int read6 = this.f25258a.read();
                int read7 = this.f25258a.read();
                int read8 = this.f25258a.read();
                if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                    ByteOrder byteOrder = this.f25259b;
                    if (byteOrder == f25256e) {
                        return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == f25257f) {
                        return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
                    }
                    throw new IOException("Invalid byte order: " + this.f25259b);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            int i10 = this.f25261d + 2;
            this.f25261d = i10;
            if (i10 <= this.f25260c) {
                int read = this.f25258a.read();
                int read2 = this.f25258a.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f25259b;
                    if (byteOrder == f25256e) {
                        return (short) ((read2 << 8) + read);
                    }
                    if (byteOrder == f25257f) {
                        return (short) ((read << 8) + read2);
                    }
                    throw new IOException("Invalid byte order: " + this.f25259b);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readUTF() throws IOException {
            this.f25261d += 2;
            return this.f25258a.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() throws IOException {
            this.f25261d++;
            return this.f25258a.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            int i10 = this.f25261d + 2;
            this.f25261d = i10;
            if (i10 <= this.f25260c) {
                int read = this.f25258a.read();
                int read2 = this.f25258a.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f25259b;
                    if (byteOrder == f25256e) {
                        return (read2 << 8) + read;
                    }
                    if (byteOrder == f25257f) {
                        return (read << 8) + read2;
                    }
                    throw new IOException("Invalid byte order: " + this.f25259b);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public int skipBytes(int i10) throws IOException {
            int min = Math.min(i10, this.f25260c - this.f25261d);
            int i11 = 0;
            while (i11 < min) {
                i11 += this.f25258a.skipBytes(min - i11);
            }
            this.f25261d += i11;
            return i11;
        }

        b(InputStream inputStream, ByteOrder byteOrder) throws IOException {
            this.f25259b = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f25258a = dataInputStream;
            int available = dataInputStream.available();
            this.f25260c = available;
            this.f25261d = 0;
            this.f25258a.mark(available);
            this.f25259b = byteOrder;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            int read = this.f25258a.read(bArr, i10, i11);
            this.f25261d += read;
            return read;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            int length = this.f25261d + bArr.length;
            this.f25261d = length;
            if (length <= this.f25260c) {
                if (this.f25258a.read(bArr, 0, bArr.length) != bArr.length) {
                    throw new IOException("Couldn't read up to the length of buffer");
                }
                return;
            }
            throw new EOFException();
        }

        public b(byte[] bArr) throws IOException {
            this(new ByteArrayInputStream(bArr));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ExifInterface.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f25262a;

        /* renamed from: b  reason: collision with root package name */
        public final int f25263b;

        /* renamed from: c  reason: collision with root package name */
        public final long f25264c;

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f25265d;

        c(int i10, int i11, byte[] bArr) {
            this(i10, i11, -1L, bArr);
        }

        public static c a(String str) {
            byte[] bytes = (str + (char) 0).getBytes(a.f25222s0);
            return new c(2, bytes.length, bytes);
        }

        public static c b(long j10, ByteOrder byteOrder) {
            return c(new long[]{j10}, byteOrder);
        }

        public static c c(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.Y[4] * jArr.length]);
            wrap.order(byteOrder);
            for (long j10 : jArr) {
                wrap.putInt((int) j10);
            }
            return new c(4, jArr.length, wrap.array());
        }

        public static c d(e eVar, ByteOrder byteOrder) {
            return e(new e[]{eVar}, byteOrder);
        }

        public static c e(e[] eVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.Y[5] * eVarArr.length]);
            wrap.order(byteOrder);
            for (e eVar : eVarArr) {
                wrap.putInt((int) eVar.f25270a);
                wrap.putInt((int) eVar.f25271b);
            }
            return new c(5, eVarArr.length, wrap.array());
        }

        public static c f(int i10, ByteOrder byteOrder) {
            return g(new int[]{i10}, byteOrder);
        }

        public static c g(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.Y[3] * iArr.length]);
            wrap.order(byteOrder);
            for (int i10 : iArr) {
                wrap.putShort((short) i10);
            }
            return new c(3, iArr.length, wrap.array());
        }

        public double h(ByteOrder byteOrder) {
            Object k10 = k(byteOrder);
            if (k10 != null) {
                if (k10 instanceof String) {
                    return Double.parseDouble((String) k10);
                }
                if (k10 instanceof long[]) {
                    long[] jArr = (long[]) k10;
                    if (jArr.length == 1) {
                        return jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k10 instanceof int[]) {
                    int[] iArr = (int[]) k10;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k10 instanceof double[]) {
                    double[] dArr = (double[]) k10;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k10 instanceof e[]) {
                    e[] eVarArr = (e[]) k10;
                    if (eVarArr.length == 1) {
                        return eVarArr[0].a();
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
            throw new NumberFormatException("NULL can't be converted to a double value");
        }

        public int i(ByteOrder byteOrder) {
            Object k10 = k(byteOrder);
            if (k10 != null) {
                if (k10 instanceof String) {
                    return Integer.parseInt((String) k10);
                }
                if (k10 instanceof long[]) {
                    long[] jArr = (long[]) k10;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k10 instanceof int[]) {
                    int[] iArr = (int[]) k10;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }

        public String j(ByteOrder byteOrder) {
            Object k10 = k(byteOrder);
            if (k10 == null) {
                return null;
            }
            if (k10 instanceof String) {
                return (String) k10;
            }
            StringBuilder sb = new StringBuilder();
            int i10 = 0;
            if (k10 instanceof long[]) {
                long[] jArr = (long[]) k10;
                while (i10 < jArr.length) {
                    sb.append(jArr[i10]);
                    i10++;
                    if (i10 != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (k10 instanceof int[]) {
                int[] iArr = (int[]) k10;
                while (i10 < iArr.length) {
                    sb.append(iArr[i10]);
                    i10++;
                    if (i10 != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (k10 instanceof double[]) {
                double[] dArr = (double[]) k10;
                while (i10 < dArr.length) {
                    sb.append(dArr[i10]);
                    i10++;
                    if (i10 != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (k10 instanceof e[]) {
                e[] eVarArr = (e[]) k10;
                while (i10 < eVarArr.length) {
                    sb.append(eVarArr[i10].f25270a);
                    sb.append('/');
                    sb.append(eVarArr[i10].f25271b);
                    i10++;
                    if (i10 != eVarArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else {
                return null;
            }
        }

        /* JADX WARN: Not initialized variable reg: 3, insn: 0x019c: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:152:0x019c */
        /* JADX WARN: Removed duplicated region for block: B:176:0x019f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        java.lang.Object k(java.nio.ByteOrder r11) {
            /*
                Method dump skipped, instructions count: 452
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: f0.a.c.k(java.nio.ByteOrder):java.lang.Object");
        }

        public String toString() {
            return "(" + a.X[this.f25262a] + ", data length:" + this.f25265d.length + ")";
        }

        c(int i10, int i11, long j10, byte[] bArr) {
            this.f25262a = i10;
            this.f25263b = i11;
            this.f25264c = j10;
            this.f25265d = bArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ExifInterface.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final long f25270a;

        /* renamed from: b  reason: collision with root package name */
        public final long f25271b;

        e(long j10, long j11) {
            if (j11 == 0) {
                this.f25270a = 0L;
                this.f25271b = 1L;
                return;
            }
            this.f25270a = j10;
            this.f25271b = j11;
        }

        public double a() {
            return this.f25270a / this.f25271b;
        }

        public String toString() {
            return this.f25270a + "/" + this.f25271b;
        }
    }

    static {
        d[] dVarArr;
        d[] dVarArr2 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ImageWidth", 256, 3, 4), new d("ImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", IronSourceConstants.INIT_COMPLETE, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", IronSourceError.ERROR_AD_UNIT_CAPPED, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED, 1)};
        f25204a0 = dVarArr2;
        d[] dVarArr3 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d("PixelXDimension", 40962, 3, 4), new d("PixelYDimension", 40963, 3, 4), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        f25205b0 = dVarArr3;
        d[] dVarArr4 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d("GPSLatitude", 2, 5), new d("GPSLongitudeRef", 3, 2), new d("GPSLongitude", 4, 5), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        f25206c0 = dVarArr4;
        d[] dVarArr5 = {new d("InteroperabilityIndex", 1, 2)};
        f25207d0 = dVarArr5;
        d[] dVarArr6 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ThumbnailImageWidth", 256, 3, 4), new d("ThumbnailImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", IronSourceConstants.INIT_COMPLETE, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", IronSourceError.ERROR_AD_UNIT_CAPPED, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        f25208e0 = dVarArr6;
        f25209f0 = new d("StripOffsets", 273, 3);
        d[] dVarArr7 = {new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)};
        f25210g0 = dVarArr7;
        d[] dVarArr8 = {new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)};
        f25211h0 = dVarArr8;
        d[] dVarArr9 = {new d("AspectFrame", 4371, 3)};
        f25212i0 = dVarArr9;
        d[] dVarArr10 = {new d("ColorSpace", 55, 3)};
        f25213j0 = dVarArr10;
        d[][] dVarArr11 = {dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr6, dVarArr2, dVarArr7, dVarArr8, dVarArr9, dVarArr10};
        f25214k0 = dVarArr11;
        f25215l0 = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        f25216m0 = new d("JPEGInterchangeFormat", 513, 4);
        f25217n0 = new d("JPEGInterchangeFormatLength", IronSourceConstants.INIT_COMPLETE, 4);
        f25218o0 = new HashMap[dVarArr11.length];
        f25219p0 = new HashMap[dVarArr11.length];
        f25220q0 = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f25221r0 = new HashMap<>();
        Charset forName = Charset.forName("US-ASCII");
        f25222s0 = forName;
        f25223t0 = "Exif\u0000\u0000".getBytes(forName);
        f25224u0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        W = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            d[][] dVarArr12 = f25214k0;
            if (i10 < dVarArr12.length) {
                f25218o0[i10] = new HashMap<>();
                f25219p0[i10] = new HashMap<>();
                for (d dVar : dVarArr12[i10]) {
                    f25218o0[i10].put(Integer.valueOf(dVar.f25266a), dVar);
                    f25219p0[i10].put(dVar.f25267b, dVar);
                }
                i10++;
            } else {
                HashMap<Integer, Integer> hashMap = f25221r0;
                d[] dVarArr13 = f25215l0;
                hashMap.put(Integer.valueOf(dVarArr13[0].f25266a), 5);
                hashMap.put(Integer.valueOf(dVarArr13[1].f25266a), 1);
                hashMap.put(Integer.valueOf(dVarArr13[2].f25266a), 2);
                hashMap.put(Integer.valueOf(dVarArr13[3].f25266a), 3);
                hashMap.put(Integer.valueOf(dVarArr13[4].f25266a), 7);
                hashMap.put(Integer.valueOf(dVarArr13[5].f25266a), 8);
                f25225v0 = Pattern.compile(".*[1-9].*");
                f25227w0 = Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
                return;
            }
        }
    }

    public a(String str) throws IOException {
        d[][] dVarArr = f25214k0;
        this.f25236f = new HashMap[dVarArr.length];
        this.f25237g = new HashSet(dVarArr.length);
        this.f25238h = ByteOrder.BIG_ENDIAN;
        Objects.requireNonNull(str, "filename cannot be null");
        t(str);
    }

    private boolean A(byte[] bArr) throws IOException {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder I2 = I(bVar2);
                this.f25238h = I2;
                bVar2.k(I2);
                boolean z10 = bVar2.readShort() == 85;
                bVar2.close();
                return z10;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static boolean B(FileDescriptor fileDescriptor) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                Os.lseek(fileDescriptor, 0L, OsConstants.SEEK_CUR);
                return true;
            } catch (Exception unused) {
                if (f25226w) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
            }
        }
        return false;
    }

    private boolean C(HashMap hashMap) throws IOException {
        c cVar;
        int i10;
        c cVar2 = (c) hashMap.get("BitsPerSample");
        if (cVar2 != null) {
            int[] iArr = (int[]) cVar2.k(this.f25238h);
            int[] iArr2 = f25230z;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f25234d == 3 && (cVar = (c) hashMap.get("PhotometricInterpretation")) != null && (((i10 = cVar.i(this.f25238h)) == 1 && Arrays.equals(iArr, B)) || (i10 == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (f25226w) {
            Log.d("ExifInterface", "Unsupported data type value");
            return false;
        }
        return false;
    }

    private boolean D(HashMap hashMap) throws IOException {
        c cVar = (c) hashMap.get("ImageLength");
        c cVar2 = (c) hashMap.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.i(this.f25238h) <= 512 && cVar2.i(this.f25238h) <= 512;
    }

    private boolean E(byte[] bArr) throws IOException {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = M;
            if (i10 >= bArr2.length) {
                int i11 = 0;
                while (true) {
                    byte[] bArr3 = N;
                    if (i11 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[M.length + i11 + 4] != bArr3[i11]) {
                        return false;
                    }
                    i11++;
                }
            } else if (bArr[i10] != bArr2[i10]) {
                return false;
            } else {
                i10++;
            }
        }
    }

    private void F(InputStream inputStream) {
        Objects.requireNonNull(inputStream, "inputstream shouldn't be null");
        for (int i10 = 0; i10 < f25214k0.length; i10++) {
            try {
                try {
                    this.f25236f[i10] = new HashMap<>();
                } catch (IOException e8) {
                    this.f25251u = false;
                    boolean z10 = f25226w;
                    if (z10) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e8);
                    }
                    a();
                    if (!z10) {
                        return;
                    }
                }
            } finally {
                a();
                if (f25226w) {
                    H();
                }
            }
        }
        if (!this.f25235e) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f25234d = j(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        b bVar = new b(inputStream);
        if (!this.f25235e) {
            switch (this.f25234d) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 5:
                case 6:
                case 8:
                case 11:
                    n(bVar);
                    break;
                case 4:
                    i(bVar, 0, 0);
                    break;
                case 7:
                    k(bVar);
                    break;
                case 9:
                    m(bVar);
                    break;
                case 10:
                    o(bVar);
                    break;
                case 12:
                    h(bVar);
                    break;
                case 13:
                    l(bVar);
                    break;
                case 14:
                    q(bVar);
                    break;
            }
        } else {
            p(bVar);
        }
        M(bVar);
        this.f25251u = true;
    }

    private void G(b bVar, int i10) throws IOException {
        ByteOrder I2 = I(bVar);
        this.f25238h = I2;
        bVar.k(I2);
        int readUnsignedShort = bVar.readUnsignedShort();
        int i11 = this.f25234d;
        if (i11 != 7 && i11 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = bVar.readInt();
        if (readInt >= 8 && readInt < i10) {
            int i12 = readInt - 8;
            if (i12 <= 0 || bVar.skipBytes(i12) == i12) {
                return;
            }
            throw new IOException("Couldn't jump to first Ifd: " + i12);
        }
        throw new IOException("Invalid first Ifd offset: " + readInt);
    }

    private void H() {
        for (int i10 = 0; i10 < this.f25236f.length; i10++) {
            Log.d("ExifInterface", "The size of tag group[" + i10 + "]: " + this.f25236f[i10].size());
            for (Map.Entry<String, c> entry : this.f25236f[i10].entrySet()) {
                c value = entry.getValue();
                Log.d("ExifInterface", "tagName: " + entry.getKey() + ", tagType: " + value.toString() + ", tagValue: '" + value.j(this.f25238h) + "'");
            }
        }
    }

    private ByteOrder I(b bVar) throws IOException {
        short readShort = bVar.readShort();
        if (readShort == 18761) {
            if (f25226w) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        } else if (readShort == 19789) {
            if (f25226w) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        } else {
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
    }

    private void J(byte[] bArr, int i10) throws IOException {
        b bVar = new b(bArr);
        G(bVar, bArr.length);
        K(bVar, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void K(f0.a.b r31, int r32) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.a.K(f0.a$b, int):void");
    }

    private void L(b bVar, int i10) throws IOException {
        c cVar;
        c cVar2 = this.f25236f[i10].get("ImageLength");
        c cVar3 = this.f25236f[i10].get("ImageWidth");
        if ((cVar2 == null || cVar3 == null) && (cVar = this.f25236f[i10].get("JPEGInterchangeFormat")) != null) {
            i(bVar, cVar.i(this.f25238h), i10);
        }
    }

    private void M(b bVar) throws IOException {
        HashMap<String, c> hashMap = this.f25236f[4];
        c cVar = hashMap.get("Compression");
        if (cVar != null) {
            int i10 = cVar.i(this.f25238h);
            this.f25245o = i10;
            if (i10 != 1) {
                if (i10 == 6) {
                    r(bVar, hashMap);
                    return;
                } else if (i10 != 7) {
                    return;
                }
            }
            if (C(hashMap)) {
                s(bVar, hashMap);
                return;
            }
            return;
        }
        this.f25245o = 6;
        r(bVar, hashMap);
    }

    private static boolean N(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < bArr2.length; i10++) {
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    private void O(int i10, int i11) throws IOException {
        if (!this.f25236f[i10].isEmpty() && !this.f25236f[i11].isEmpty()) {
            c cVar = this.f25236f[i10].get("ImageLength");
            c cVar2 = this.f25236f[i10].get("ImageWidth");
            c cVar3 = this.f25236f[i11].get("ImageLength");
            c cVar4 = this.f25236f[i11].get("ImageWidth");
            if (cVar == null || cVar2 == null) {
                if (f25226w) {
                    Log.d("ExifInterface", "First image does not contain valid size information");
                }
            } else if (cVar3 != null && cVar4 != null) {
                int i12 = cVar.i(this.f25238h);
                int i13 = cVar2.i(this.f25238h);
                int i14 = cVar3.i(this.f25238h);
                int i15 = cVar4.i(this.f25238h);
                if (i12 >= i14 || i13 >= i15) {
                    return;
                }
                HashMap<String, c>[] hashMapArr = this.f25236f;
                HashMap<String, c> hashMap = hashMapArr[i10];
                hashMapArr[i10] = hashMapArr[i11];
                hashMapArr[i11] = hashMap;
            } else if (f25226w) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
            }
        } else if (f25226w) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    private void P(b bVar, int i10) throws IOException {
        c f10;
        c f11;
        c cVar = this.f25236f[i10].get("DefaultCropSize");
        c cVar2 = this.f25236f[i10].get("SensorTopBorder");
        c cVar3 = this.f25236f[i10].get("SensorLeftBorder");
        c cVar4 = this.f25236f[i10].get("SensorBottomBorder");
        c cVar5 = this.f25236f[i10].get("SensorRightBorder");
        if (cVar == null) {
            if (cVar2 != null && cVar3 != null && cVar4 != null && cVar5 != null) {
                int i11 = cVar2.i(this.f25238h);
                int i12 = cVar4.i(this.f25238h);
                int i13 = cVar5.i(this.f25238h);
                int i14 = cVar3.i(this.f25238h);
                if (i12 <= i11 || i13 <= i14) {
                    return;
                }
                c f12 = c.f(i12 - i11, this.f25238h);
                c f13 = c.f(i13 - i14, this.f25238h);
                this.f25236f[i10].put("ImageLength", f12);
                this.f25236f[i10].put("ImageWidth", f13);
                return;
            }
            L(bVar, i10);
            return;
        }
        if (cVar.f25262a == 5) {
            e[] eVarArr = (e[]) cVar.k(this.f25238h);
            if (eVarArr != null && eVarArr.length == 2) {
                f10 = c.d(eVarArr[0], this.f25238h);
                f11 = c.d(eVarArr[1], this.f25238h);
            } else {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                return;
            }
        } else {
            int[] iArr = (int[]) cVar.k(this.f25238h);
            if (iArr != null && iArr.length == 2) {
                f10 = c.f(iArr[0], this.f25238h);
                f11 = c.f(iArr[1], this.f25238h);
            } else {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                return;
            }
        }
        this.f25236f[i10].put("ImageWidth", f10);
        this.f25236f[i10].put("ImageLength", f11);
    }

    private void Q() throws IOException {
        O(0, 5);
        O(0, 4);
        O(5, 4);
        c cVar = this.f25236f[1].get("PixelXDimension");
        c cVar2 = this.f25236f[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            this.f25236f[0].put("ImageWidth", cVar);
            this.f25236f[0].put("ImageLength", cVar2);
        }
        if (this.f25236f[4].isEmpty() && D(this.f25236f[5])) {
            HashMap<String, c>[] hashMapArr = this.f25236f;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (D(this.f25236f[4])) {
            return;
        }
        Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
    }

    private void a() {
        String e8 = e("DateTimeOriginal");
        if (e8 != null && e("DateTime") == null) {
            this.f25236f[0].put("DateTime", c.a(e8));
        }
        if (e("ImageWidth") == null) {
            this.f25236f[0].put("ImageWidth", c.b(0L, this.f25238h));
        }
        if (e("ImageLength") == null) {
            this.f25236f[0].put("ImageLength", c.b(0L, this.f25238h));
        }
        if (e("Orientation") == null) {
            this.f25236f[0].put("Orientation", c.b(0L, this.f25238h));
        }
        if (e("LightSource") == null) {
            this.f25236f[1].put("LightSource", c.b(0L, this.f25238h));
        }
    }

    private static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            sb.append(String.format("%02x", Byte.valueOf(bArr[i10])));
        }
        return sb.toString();
    }

    private static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e8) {
                throw e8;
            } catch (Exception unused) {
            }
        }
    }

    private static long[] d(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                jArr[i10] = iArr[i10];
            }
            return jArr;
        } else if (obj instanceof long[]) {
            return (long[]) obj;
        } else {
            return null;
        }
    }

    private c g(String str) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        if ("ISOSpeedRatings".equals(str)) {
            if (f25226w) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i10 = 0; i10 < f25214k0.length; i10++) {
            c cVar = this.f25236f[i10].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    private void h(b bVar) throws IOException {
        String str;
        String str2;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                mediaMetadataRetriever.setDataSource(new C0273a(bVar));
            } else {
                FileDescriptor fileDescriptor = this.f25232b;
                if (fileDescriptor != null) {
                    mediaMetadataRetriever.setDataSource(fileDescriptor);
                } else {
                    String str3 = this.f25231a;
                    if (str3 == null) {
                        return;
                    }
                    mediaMetadataRetriever.setDataSource(str3);
                }
            }
            String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
            String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
            String str4 = null;
            if ("yes".equals(extractMetadata3)) {
                str4 = mediaMetadataRetriever.extractMetadata(29);
                str = mediaMetadataRetriever.extractMetadata(30);
                str2 = mediaMetadataRetriever.extractMetadata(31);
            } else if ("yes".equals(extractMetadata4)) {
                str4 = mediaMetadataRetriever.extractMetadata(18);
                str = mediaMetadataRetriever.extractMetadata(19);
                str2 = mediaMetadataRetriever.extractMetadata(24);
            } else {
                str = null;
                str2 = null;
            }
            if (str4 != null) {
                this.f25236f[0].put("ImageWidth", c.f(Integer.parseInt(str4), this.f25238h));
            }
            if (str != null) {
                this.f25236f[0].put("ImageLength", c.f(Integer.parseInt(str), this.f25238h));
            }
            if (str2 != null) {
                int i10 = 1;
                int parseInt = Integer.parseInt(str2);
                if (parseInt == 90) {
                    i10 = 6;
                } else if (parseInt == 180) {
                    i10 = 3;
                } else if (parseInt == 270) {
                    i10 = 8;
                }
                this.f25236f[0].put("Orientation", c.f(i10, this.f25238h));
            }
            if (extractMetadata != null && extractMetadata2 != null) {
                int parseInt2 = Integer.parseInt(extractMetadata);
                int parseInt3 = Integer.parseInt(extractMetadata2);
                if (parseInt3 > 6) {
                    bVar.j(parseInt2);
                    byte[] bArr = new byte[6];
                    if (bVar.read(bArr) == 6) {
                        int i11 = parseInt2 + 6;
                        int i12 = parseInt3 - 6;
                        if (Arrays.equals(bArr, f25223t0)) {
                            byte[] bArr2 = new byte[i12];
                            if (bVar.read(bArr2) == i12) {
                                this.f25246p = i11;
                                J(bArr2, 0);
                            } else {
                                throw new IOException("Can't read exif");
                            }
                        } else {
                            throw new IOException("Invalid identifier");
                        }
                    } else {
                        throw new IOException("Can't read identifier");
                    }
                } else {
                    throw new IOException("Invalid exif length");
                }
            }
            if (f25226w) {
                Log.d("ExifInterface", "Heif meta: " + str4 + "x" + str + ", rotation " + str2);
            }
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x019c, code lost:
        r20.k(r19.f25238h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01a1, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c2 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void i(f0.a.b r20, int r21, int r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.a.i(f0.a$b, int, int):void");
    }

    private int j(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (w(bArr)) {
            return 4;
        }
        if (z(bArr)) {
            return 9;
        }
        if (v(bArr)) {
            return 12;
        }
        if (x(bArr)) {
            return 7;
        }
        if (A(bArr)) {
            return 10;
        }
        if (y(bArr)) {
            return 13;
        }
        return E(bArr) ? 14 : 0;
    }

    private void k(b bVar) throws IOException {
        n(bVar);
        c cVar = this.f25236f[1].get("MakerNote");
        if (cVar != null) {
            b bVar2 = new b(cVar.f25265d);
            bVar2.k(this.f25238h);
            byte[] bArr = G;
            byte[] bArr2 = new byte[bArr.length];
            bVar2.readFully(bArr2);
            bVar2.j(0L);
            byte[] bArr3 = H;
            byte[] bArr4 = new byte[bArr3.length];
            bVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                bVar2.j(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                bVar2.j(12L);
            }
            K(bVar2, 6);
            c cVar2 = this.f25236f[7].get("PreviewImageStart");
            c cVar3 = this.f25236f[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                this.f25236f[5].put("JPEGInterchangeFormat", cVar2);
                this.f25236f[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = this.f25236f[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.k(this.f25238h);
                if (iArr != null && iArr.length == 4) {
                    if (iArr[2] <= iArr[0] || iArr[3] <= iArr[1]) {
                        return;
                    }
                    int i10 = (iArr[2] - iArr[0]) + 1;
                    int i11 = (iArr[3] - iArr[1]) + 1;
                    if (i10 < i11) {
                        int i12 = i10 + i11;
                        i11 = i12 - i11;
                        i10 = i12 - i11;
                    }
                    c f10 = c.f(i10, this.f25238h);
                    c f11 = c.f(i11, this.f25238h);
                    this.f25236f[0].put("ImageWidth", f10);
                    this.f25236f[0].put("ImageLength", f11);
                    return;
                }
                Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
            }
        }
    }

    private void l(b bVar) throws IOException {
        if (f25226w) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.k(ByteOrder.BIG_ENDIAN);
        byte[] bArr = I;
        bVar.skipBytes(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int readInt = bVar.readInt();
                int i10 = length + 4;
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int i11 = i10 + 4;
                    if (i11 == 16 && !Arrays.equals(bArr2, K)) {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                    }
                    if (Arrays.equals(bArr2, L)) {
                        return;
                    }
                    if (Arrays.equals(bArr2, J)) {
                        byte[] bArr3 = new byte[readInt];
                        if (bVar.read(bArr3) == readInt) {
                            int readInt2 = bVar.readInt();
                            CRC32 crc32 = new CRC32();
                            crc32.update(bArr2);
                            crc32.update(bArr3);
                            if (((int) crc32.getValue()) == readInt2) {
                                this.f25246p = i11;
                                J(bArr3, 0);
                                Q();
                                return;
                            }
                            throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + b(bArr2));
                    }
                    int i12 = readInt + 4;
                    bVar.skipBytes(i12);
                    length = i11 + i12;
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    private void m(b bVar) throws IOException {
        bVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        bVar.read(bArr);
        bVar.skipBytes(4);
        bVar.read(bArr2);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        i(bVar, i10, 5);
        bVar.j(i11);
        bVar.k(ByteOrder.BIG_ENDIAN);
        int readInt = bVar.readInt();
        if (f25226w) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i12 = 0; i12 < readInt; i12++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == f25209f0.f25266a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                c f10 = c.f(readShort, this.f25238h);
                c f11 = c.f(readShort2, this.f25238h);
                this.f25236f[0].put("ImageLength", f10);
                this.f25236f[0].put("ImageWidth", f11);
                if (f25226w) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            bVar.skipBytes(readUnsignedShort2);
        }
    }

    private void n(b bVar) throws IOException {
        c cVar;
        G(bVar, bVar.available());
        K(bVar, 0);
        P(bVar, 0);
        P(bVar, 5);
        P(bVar, 4);
        Q();
        if (this.f25234d != 8 || (cVar = this.f25236f[1].get("MakerNote")) == null) {
            return;
        }
        b bVar2 = new b(cVar.f25265d);
        bVar2.k(this.f25238h);
        bVar2.j(6L);
        K(bVar2, 9);
        c cVar2 = this.f25236f[9].get("ColorSpace");
        if (cVar2 != null) {
            this.f25236f[1].put("ColorSpace", cVar2);
        }
    }

    private void o(b bVar) throws IOException {
        n(bVar);
        if (this.f25236f[0].get("JpgFromRaw") != null) {
            i(bVar, this.f25250t, 5);
        }
        c cVar = this.f25236f[0].get("ISO");
        c cVar2 = this.f25236f[1].get("PhotographicSensitivity");
        if (cVar == null || cVar2 != null) {
            return;
        }
        this.f25236f[1].put("PhotographicSensitivity", cVar);
    }

    private void p(b bVar) throws IOException {
        byte[] bArr = f25223t0;
        bVar.skipBytes(bArr.length);
        byte[] bArr2 = new byte[bVar.available()];
        bVar.readFully(bArr2);
        this.f25246p = bArr.length;
        J(bArr2, 0);
    }

    private void q(b bVar) throws IOException {
        if (f25226w) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.k(ByteOrder.LITTLE_ENDIAN);
        bVar.skipBytes(M.length);
        int readInt = bVar.readInt() + 8;
        int skipBytes = bVar.skipBytes(N.length) + 8;
        while (true) {
            try {
                byte[] bArr = new byte[4];
                if (bVar.read(bArr) == 4) {
                    int readInt2 = bVar.readInt();
                    int i10 = skipBytes + 4 + 4;
                    if (Arrays.equals(O, bArr)) {
                        byte[] bArr2 = new byte[readInt2];
                        if (bVar.read(bArr2) == readInt2) {
                            this.f25246p = i10;
                            J(bArr2, 0);
                            this.f25246p = i10;
                            return;
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + b(bArr));
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    int i11 = i10 + readInt2;
                    if (i11 == readInt) {
                        return;
                    }
                    if (i11 <= readInt) {
                        int skipBytes2 = bVar.skipBytes(readInt2);
                        if (skipBytes2 != readInt2) {
                            throw new IOException("Encountered WebP file with invalid chunk size");
                        }
                        skipBytes = i10 + skipBytes2;
                    } else {
                        throw new IOException("Encountered WebP file with invalid chunk size");
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    private void r(b bVar, HashMap hashMap) throws IOException {
        c cVar = (c) hashMap.get("JPEGInterchangeFormat");
        c cVar2 = (c) hashMap.get("JPEGInterchangeFormatLength");
        if (cVar == null || cVar2 == null) {
            return;
        }
        int i10 = cVar.i(this.f25238h);
        int i11 = cVar2.i(this.f25238h);
        if (this.f25234d == 7) {
            i10 += this.f25247q;
        }
        int min = Math.min(i11, bVar.a() - i10);
        if (i10 > 0 && min > 0) {
            this.f25239i = true;
            int i12 = this.f25246p + i10;
            this.f25242l = i12;
            this.f25243m = min;
            if (this.f25231a == null && this.f25233c == null && this.f25232b == null) {
                byte[] bArr = new byte[min];
                bVar.j(i12);
                bVar.readFully(bArr);
                this.f25244n = bArr;
            }
        }
        if (f25226w) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + i10 + ", length: " + min);
        }
    }

    private void s(b bVar, HashMap hashMap) throws IOException {
        c cVar = (c) hashMap.get("StripOffsets");
        c cVar2 = (c) hashMap.get("StripByteCounts");
        if (cVar == null || cVar2 == null) {
            return;
        }
        long[] d10 = d(cVar.k(this.f25238h));
        long[] d11 = d(cVar2.k(this.f25238h));
        if (d10 != null && d10.length != 0) {
            if (d11 != null && d11.length != 0) {
                if (d10.length != d11.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j10 = 0;
                for (long j11 : d11) {
                    j10 += j11;
                }
                int i10 = (int) j10;
                byte[] bArr = new byte[i10];
                this.f25241k = true;
                this.f25240j = true;
                this.f25239i = true;
                int i11 = 0;
                int i12 = 0;
                for (int i13 = 0; i13 < d10.length; i13++) {
                    int i14 = (int) d10[i13];
                    int i15 = (int) d11[i13];
                    if (i13 < d10.length - 1 && i14 + i15 != d10[i13 + 1]) {
                        this.f25241k = false;
                    }
                    int i16 = i14 - i11;
                    if (i16 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                    }
                    bVar.j(i16);
                    int i17 = i11 + i16;
                    byte[] bArr2 = new byte[i15];
                    bVar.read(bArr2);
                    i11 = i17 + i15;
                    System.arraycopy(bArr2, 0, bArr, i12, i15);
                    i12 += i15;
                }
                this.f25244n = bArr;
                if (this.f25241k) {
                    this.f25242l = ((int) d10[0]) + this.f25246p;
                    this.f25243m = i10;
                    return;
                }
                return;
            }
            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            return;
        }
        Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
    }

    private void t(String str) throws IOException {
        Objects.requireNonNull(str, "filename cannot be null");
        FileInputStream fileInputStream = null;
        this.f25233c = null;
        this.f25231a = str;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                if (B(fileInputStream2.getFD())) {
                    this.f25232b = fileInputStream2.getFD();
                } else {
                    this.f25232b = null;
                }
                F(fileInputStream2);
                c(fileInputStream2);
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                c(fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static boolean u(BufferedInputStream bufferedInputStream) throws IOException {
        byte[] bArr = f25223t0;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i10 = 0;
        while (true) {
            byte[] bArr3 = f25223t0;
            if (i10 >= bArr3.length) {
                return true;
            }
            if (bArr2[i10] != bArr3[i10]) {
                return false;
            }
            i10++;
        }
    }

    private boolean v(byte[] bArr) throws IOException {
        b bVar;
        long readInt;
        byte[] bArr2;
        b bVar2 = null;
        try {
            try {
                bVar = new b(bArr);
            } catch (Exception e8) {
                e = e8;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            readInt = bVar.readInt();
            bArr2 = new byte[4];
            bVar.read(bArr2);
        } catch (Exception e10) {
            e = e10;
            bVar2 = bVar;
            if (f25226w) {
                Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
            }
            if (bVar2 != null) {
                bVar2.close();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
        if (!Arrays.equals(bArr2, D)) {
            bVar.close();
            return false;
        }
        long j10 = 16;
        if (readInt == 1) {
            readInt = bVar.readLong();
            if (readInt < 16) {
                bVar.close();
                return false;
            }
        } else {
            j10 = 8;
        }
        if (readInt > bArr.length) {
            readInt = bArr.length;
        }
        long j11 = readInt - j10;
        if (j11 < 8) {
            bVar.close();
            return false;
        }
        byte[] bArr3 = new byte[4];
        boolean z10 = false;
        boolean z11 = false;
        for (long j12 = 0; j12 < j11 / 4; j12++) {
            if (bVar.read(bArr3) != 4) {
                bVar.close();
                return false;
            }
            if (j12 != 1) {
                if (Arrays.equals(bArr3, E)) {
                    z10 = true;
                } else if (Arrays.equals(bArr3, F)) {
                    z11 = true;
                }
                if (z10 && z11) {
                    bVar.close();
                    return true;
                }
            }
        }
        bVar.close();
        return false;
    }

    private static boolean w(byte[] bArr) throws IOException {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = C;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    private boolean x(byte[] bArr) throws IOException {
        boolean z10 = false;
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder I2 = I(bVar2);
                this.f25238h = I2;
                bVar2.k(I2);
                short readShort = bVar2.readShort();
                z10 = (readShort == 20306 || readShort == 21330) ? true : true;
                bVar2.close();
                return z10;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private boolean y(byte[] bArr) throws IOException {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = I;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    private boolean z(byte[] bArr) throws IOException {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i10 = 0; i10 < bytes.length; i10++) {
            if (bArr[i10] != bytes[i10]) {
                return false;
            }
        }
        return true;
    }

    public String e(String str) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        c g10 = g(str);
        if (g10 != null) {
            if (!f25220q0.contains(str)) {
                return g10.j(this.f25238h);
            }
            if (str.equals("GPSTimeStamp")) {
                int i10 = g10.f25262a;
                if (i10 != 5 && i10 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + g10.f25262a);
                    return null;
                }
                e[] eVarArr = (e[]) g10.k(this.f25238h);
                if (eVarArr != null && eVarArr.length == 3) {
                    return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) eVarArr[0].f25270a) / ((float) eVarArr[0].f25271b))), Integer.valueOf((int) (((float) eVarArr[1].f25270a) / ((float) eVarArr[1].f25271b))), Integer.valueOf((int) (((float) eVarArr[2].f25270a) / ((float) eVarArr[2].f25271b))));
                }
                Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                return null;
            }
            try {
                return Double.toString(g10.h(this.f25238h));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public int f(String str, int i10) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        c g10 = g(str);
        if (g10 == null) {
            return i10;
        }
        try {
            return g10.i(this.f25238h);
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExifInterface.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f25266a;

        /* renamed from: b  reason: collision with root package name */
        public final String f25267b;

        /* renamed from: c  reason: collision with root package name */
        public final int f25268c;

        /* renamed from: d  reason: collision with root package name */
        public final int f25269d;

        d(String str, int i10, int i11) {
            this.f25267b = str;
            this.f25266a = i10;
            this.f25268c = i11;
            this.f25269d = -1;
        }

        boolean a(int i10) {
            int i11;
            int i12 = this.f25268c;
            if (i12 == 7 || i10 == 7 || i12 == i10 || (i11 = this.f25269d) == i10) {
                return true;
            }
            if ((i12 == 4 || i11 == 4) && i10 == 3) {
                return true;
            }
            if ((i12 == 9 || i11 == 9) && i10 == 8) {
                return true;
            }
            return (i12 == 12 || i11 == 12) && i10 == 11;
        }

        d(String str, int i10, int i11, int i12) {
            this.f25267b = str;
            this.f25266a = i10;
            this.f25268c = i11;
            this.f25269d = i12;
        }
    }

    public a(InputStream inputStream) throws IOException {
        this(inputStream, false);
    }

    private a(InputStream inputStream, boolean z10) throws IOException {
        d[][] dVarArr = f25214k0;
        this.f25236f = new HashMap[dVarArr.length];
        this.f25237g = new HashSet(dVarArr.length);
        this.f25238h = ByteOrder.BIG_ENDIAN;
        Objects.requireNonNull(inputStream, "inputStream cannot be null");
        this.f25231a = null;
        if (z10) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            if (!u(bufferedInputStream)) {
                Log.w("ExifInterface", "Given data does not follow the structure of an Exif-only data.");
                return;
            }
            this.f25235e = true;
            this.f25233c = null;
            this.f25232b = null;
            inputStream = bufferedInputStream;
        } else if (inputStream instanceof AssetManager.AssetInputStream) {
            this.f25233c = (AssetManager.AssetInputStream) inputStream;
            this.f25232b = null;
        } else {
            if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                if (B(fileInputStream.getFD())) {
                    this.f25233c = null;
                    this.f25232b = fileInputStream.getFD();
                }
            }
            this.f25233c = null;
            this.f25232b = null;
        }
        F(inputStream);
    }
}
