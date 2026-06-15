package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
/* compiled from: AppCompatTextClassifierHelper.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class a0 {

    /* renamed from: a  reason: collision with root package name */
    private TextView f1446a;

    /* renamed from: b  reason: collision with root package name */
    private TextClassifier f1447b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(TextView textView) {
        this.f1446a = (TextView) androidx.core.util.i.f(textView);
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f1447b;
        if (textClassifier == null) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) this.f1446a.getContext().getSystemService(TextClassificationManager.class);
            if (textClassificationManager != null) {
                return textClassificationManager.getTextClassifier();
            }
            return TextClassifier.NO_OP;
        }
        return textClassifier;
    }

    public void b(TextClassifier textClassifier) {
        this.f1447b = textClassifier;
    }
}
