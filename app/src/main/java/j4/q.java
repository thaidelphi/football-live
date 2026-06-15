package j4;

import java.io.IOException;
/* compiled from: SampleQueueMappingException.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class q extends IOException {
    public q(String str) {
        super("Unable to bind a sample queue to TrackGroup with mime type " + str + ".");
    }
}
