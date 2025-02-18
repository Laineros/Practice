package Algorithm;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
public class MultiplyAndTransposeMatrix {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        short n, m, k;
        n = scanner.nextShort();
        m = scanner.nextShort();
        k = scanner.nextShort();
        short[][] matrixA = new short[n][m];
        short[][] matrixB = new short[m][k];
        short matrixPiece;
        for (short i = 0; i < n; i++) {
            for (short j = 0; j < m; j++) {
                matrixPiece = scanner.nextShort();
                matrixA[i][j] = matrixPiece;
            }
        }
        for (short i = 0; i < m; i++) {
            for (short j = 0; j < k; j++) {
                matrixPiece = scanner.nextShort();
                matrixB[i][j] = matrixPiece;
            }
        }
        short[][] matrixC = new short[n][k];
        for (short i = 0; i < n; i++) {
            for (short j = 0; j < k; j++) {
                matrixC[i][j] = 0;

                for (short l = 0; l < m; l++) {
                    matrixC[i][j] += (matrixA[i][l] * matrixB[l][j]);
                }
            }
        }
        short[][] matrixCT = new short[k][n];
        for (short i = 0; i < k; i++) {
            writer.newLine();
            for (short j = 0; j < n; j++) {
                matrixCT[i][j] = matrixC[j][i];
                writer.write(matrixCT[i][j] + " ");
            }
        }
        scanner.close();
        writer.close();
    }
}
