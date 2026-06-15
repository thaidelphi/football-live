package com.ironsource;

import android.text.TextUtils;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
class yc implements Callable<eb> {

    /* renamed from: d  reason: collision with root package name */
    private static final String f21525d = "FileWorkerThread";

    /* renamed from: e  reason: collision with root package name */
    private static final String f21526e = "X-Android-Protocols";

    /* renamed from: f  reason: collision with root package name */
    private static final String f21527f = "http/1.1,h2";

    /* renamed from: a  reason: collision with root package name */
    private final db f21528a;

    /* renamed from: b  reason: collision with root package name */
    private final String f21529b;

    /* renamed from: c  reason: collision with root package name */
    private long f21530c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public yc(db dbVar, String str, long j10) {
        this.f21528a = dbVar;
        this.f21529b = str;
        this.f21530c = j10;
    }

    int a(byte[] bArr, String str) throws Exception {
        return IronSourceStorageUtils.saveFile(bArr, str);
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a */
    public eb call() {
        int i10;
        if (this.f21530c == 0) {
            this.f21530c = 1L;
        }
        eb ebVar = null;
        for (int i11 = 0; i11 < this.f21530c; i11++) {
            ebVar = a(this.f21528a.e(), i11, this.f21528a.a(), this.f21528a.c(), this.f21528a.f());
            int b10 = ebVar.b();
            if (b10 != 1008 && b10 != 1009) {
                break;
            }
        }
        if (ebVar != null && ebVar.a() != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f21529b);
            String str = File.separator;
            sb.append(str);
            sb.append(this.f21528a.b().getName());
            String sb2 = sb.toString();
            String str2 = this.f21528a.d() + str + d9.E + this.f21528a.b().getName();
            try {
                if (a(ebVar.a(), str2) == 0) {
                    ebVar.a(1006);
                } else if (!a(str2, sb2)) {
                    ebVar.a(d9.f16966j);
                }
            } catch (FileNotFoundException e8) {
                o9.d().a(e8);
                i10 = 1018;
                ebVar.a(i10);
            } catch (Error e10) {
                o9.d().a(e10);
                if (!TextUtils.isEmpty(e10.getMessage())) {
                    Logger.i(f21525d, e10.getMessage());
                }
                i10 = 1019;
                ebVar.a(i10);
            } catch (Exception e11) {
                o9.d().a(e11);
                if (!TextUtils.isEmpty(e11.getMessage())) {
                    Logger.i(f21525d, e11.getMessage());
                }
                ebVar.a(1009);
            }
        }
        return ebVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c5, code lost:
        if (r4 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0104, code lost:
        if (r4 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0106, code lost:
        r4.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x011a, code lost:
        if (r4 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x012d, code lost:
        if (r4 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0140, code lost:
        if (r4 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0153, code lost:
        if (r4 != null) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0087 A[Catch: all -> 0x008e, TRY_ENTER, TryCatch #9 {all -> 0x008e, blocks: (B:23:0x0087, B:24:0x008a, B:48:0x00c2), top: B:112:0x0018 }] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.net.HttpURLConnection, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    com.ironsource.eb a(java.lang.String r7, int r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.yc.a(java.lang.String, int, int, int, boolean):com.ironsource.eb");
    }

    boolean a(String str, String str2) throws Exception {
        return IronSourceStorageUtils.renameFile(str, str2);
    }

    byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr, 0, 8192);
            if (read == -1) {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }
}
