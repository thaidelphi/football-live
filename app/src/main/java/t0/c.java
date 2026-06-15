package t0;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import androidx.room.q0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import v0.j;
/* compiled from: DBUtil.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class c {
    public static void a(v0.g gVar) {
        ArrayList<String> arrayList = new ArrayList();
        Cursor r02 = gVar.r0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (r02.moveToNext()) {
            try {
                arrayList.add(r02.getString(0));
            } catch (Throwable th) {
                r02.close();
                throw th;
            }
        }
        r02.close();
        for (String str : arrayList) {
            if (str.startsWith("room_fts_content_sync_")) {
                gVar.m("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    public static Cursor b(q0 q0Var, j jVar, boolean z10, CancellationSignal cancellationSignal) {
        Cursor query = q0Var.query(jVar, cancellationSignal);
        if (z10 && (query instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) query;
            int count = abstractWindowedCursor.getCount();
            return (Build.VERSION.SDK_INT < 23 || (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) ? b.a(abstractWindowedCursor) : query;
        }
        return query;
    }

    public static int c(File file) throws IOException {
        FileChannel fileChannel = null;
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            FileChannel channel = new FileInputStream(file).getChannel();
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(allocate) == 4) {
                allocate.rewind();
                int i10 = allocate.getInt();
                channel.close();
                return i10;
            }
            throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
        } catch (Throwable th) {
            if (0 != 0) {
                fileChannel.close();
            }
            throw th;
        }
    }
}
