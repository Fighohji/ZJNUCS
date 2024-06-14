#include <stdio.h>
char s[] = "Hello World\n";
int main() {
  for (int i = 0; s[i]; ++i) {
    if (s[i] >= 97 && s[i] <= 122)
      s[i] = s[i] - 32;
  }
  printf("%s", s);
  return 0;
}
