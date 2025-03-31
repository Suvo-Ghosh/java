// 1-
// *
// * *
// * * *
// * * * *
// * * * * *
// * * * *
// * * *
// * *
// *

// class Main {
// public static void main(String[] args) {
// int n = 5;
// for (int i = 0; i < n; i++) {
// for (int j = 0; j <= i; j++) {
// System.out.print("* ");
// }
// System.out.println(" ");
// }

// for (int i = 0; i < n - 1; i++) {
// for (int j = 4; j > i; j--) {
// System.out.print("* ");
// }
// System.out.println(" ");
// }
// }
// }

// 2-
// * * * * *
// * * * *
// * * *
// * *
// *

// class Main {
// public static void main(String[] args) {
// int n = 5;
// for (int i = 0; i < n; i++) {
// for (int j = 1; j <= i; j++) {
// System.out.print(" ");
// }
// for (int j = 5; j > i; j--) {
// System.out.print("* ");
// }
// System.out.println(" ");
// }
// }
// }

// 3-
// * * * * *
// * * * *
// * * *
// * *
// *
// * *
// * * *
// * * * *
// * * * * *

// class Main {
// public static void main(String[] args) {
// int n = 5;
// for (int i = 0; i < n; i++) {
// for (int j = 1; j <= i; j++) {
// System.out.print(" ");
// }
// for (int j = 5; j > i; j--) {
// System.out.print("* ");
// }
// System.out.println(" ");
// }
// for (int i = 0; i < n - 1; i++) {
// for (int j = 3; j > i; j--) {
// System.out.print(" ");
// }
// for (int j = 0; j <= i + 1; j++) {
// System.out.print("* ");
// }
// System.out.println(" ");
// }
// }
// }

// 4 -
// *
// * *
// * * *
// * * * *
// * * * * *
// class Main {
// public static void main(String[] args) {
// int n = 5;
// for (int i = 0; i < n; i++) {
// for (int j = 4; j > i; j--) {
// System.out.print(" ");
// }
// for (int j = 0; j <= i; j++) {
// System.out.print("* ");
// }
// System.out.println(" ");
// }
// }
// }

// 5 -
// * * * * *
// * * * *
// * * *
// * *
// *
// class Main {
// public static void main(String[] args) {
// int n = 5;
// for (int i = 0; i < n; i++) {
// for (int j = 1; j <= i; j++) {
// System.out.print(" ");
// }
// for (int j = n; j > i; j--) {
// System.out.print("* ");
// }
// System.out.println(" ");
// }
// }
// }

// 6-
// *
// * *
// * * *
// * * * *
// * * * * *
// * * * *
// * * *
// * *
// *

// class Main {
// public static void main(String[] args) {
// int n = 5;
// for (int i = 0; i < n; i++) {
// for (int j = 4; j > i; j--) {
// System.out.print(" ");
// }
// for (int j = 0; j <= i; j++) {
// System.out.print("* ");
// }
// System.out.println(" ");
// }
// for (int i = 0; i < n; i++) {
// for (int j = 0; j <= i; j++) {
// System.out.print(" ");
// }
// for (int j = n - 1; j > i; j--) {
// System.out.print("* ");
// }
// System.out.println(" ");
// }
// }
// }

// 7-
// *
// * *
// * * *
// * * * *
// * * * * *
// * * * *
// * * *
// * *
// *
// class Main {
// public static void main(String[] args) {
// int n = 5;
// for (int i = 0; i < n; i++) {
// for (int j = 4; j > i; j--) {
// System.out.print(" ");
// }
// for (int j = 0; j <= i; j++) {
// System.out.print("* ");
// }
// System.out.println(" ");
// }
// for (int i = 0; i < n - 1; i++) {
// for (int j = 0; j <= i; j++) {
// System.out.print(" ");
// }
// for (int j = 4; j > i; j--) {
// System.out.print("* ");
// }
// System.out.println(" ");
// }
// }
// }

// 8-
// * * * * *
// * *
// * *
// * *
// * * * * *
// class Main {
// public static void main(String[] args) {
// int n = 5;
// for (int i = 0; i < n; i++) {
// for (int j = 0; j < n; j++) {
// if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {

// System.out.print("* ");
// } else {
// System.out.print(" ");

// }
// }
// System.out.println();
// }
// }
// }

// 9-
// *
// * *
// * *
// * *
// * * * * *

// class Main {
// public static void main(String[] args) {
// int n = 5;
// for (int i = 0; i < n; i++) {
// for (int j = 4; j > i; j--) {
// System.out.print(" ");
// }
// for (int j = 0; j <= i; j++) {
// if (i == n - 1 || j == 0 || i == j) {
// System.out.print("* ");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println(" ");
// }
// }
// }

// 10-
// *
// * *
// * *
// * *
// * * * * *

// 11-
// *
// * *
// * *
// * *
// * *
// * *
// * *
// * *
// *
// 12-
// *
// * *
// * *
// * *
// * *
// * *
// * *
// * *
// *

// class pattern {
// public static void main(String[] args) {
// int n = 5;
// for (int i = 0; i < n; i++) {
// for (int j = 4; j > i; j--) {
// System.out.print(" ");
// }
// for (int j = 0; j <= i; j++) {
// if (i == n - 1 || j == 0 || i == j) {
// System.out.print("* ");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println(" ");
// }
// }
// }