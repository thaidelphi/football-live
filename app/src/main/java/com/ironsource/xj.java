package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class xj {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class a extends GZIPOutputStream {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f21403a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(OutputStream outputStream, int i10) throws IOException {
            super(outputStream);
            this.f21403a = i10;
            if (i10 < 0 || i10 > 9) {
                return;
            }
            ((GZIPOutputStream) this).def.setLevel(i10);
        }
    }

    public static String a(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(gZIPInputStream, "UTF-8"));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return sb.toString();
                }
                sb.append(readLine);
            }
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error("exception while decompressing " + e8);
            return null;
        } catch (OutOfMemoryError e10) {
            o9.d().a(e10);
            String str = "Error while decompressing:" + e10.getMessage();
            IronLog.INTERNAL.error(str);
            b(str);
            return null;
        }
    }

    public static byte[] a(String str) throws Exception {
        return a(str, -1);
    }

    public static byte[] a(String str, int i10) throws Exception {
        byte[] bArr = new byte[0];
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
            a aVar = new a(byteArrayOutputStream, i10);
            aVar.write(str.getBytes());
            aVar.close();
            bArr = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return bArr;
        } catch (OutOfMemoryError e8) {
            o9.d().a(e8);
            String str2 = "Error while compressing:" + e8.getMessage();
            IronLog.INTERNAL.error(str2);
            b(str2);
            return bArr;
        }
    }

    private static void b(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            jSONObject.put(IronSourceConstants.EVENTS_EXT1, str);
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
        ar.i().a(new zb(81321, jSONObject));
    }
}
