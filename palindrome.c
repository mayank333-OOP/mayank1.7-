#include <stdio.h>
#include <string.h>
#include <ctype.h>

int isPalindrome(char *str) {
    int left = 0, right = strlen(str) - 1;
    
    while (left < right) {
        // Skip non-alphabetic characters from left
        while (left < right && !isalpha(str[left]))
            left++;
        
        // Skip non-alphabetic characters from right
        while (left < right && !isalpha(str[right]))
            right--;
        
        // Compare ignoring case
        if (tolower(str[left]) != tolower(str[right]))
            return 0;  // Not a palindrome
        
        left++;
        right--;
    }
    return 1;  // Palindrome
}

int main() {
    char str[100];
    
    printf("Enter a string: ");
    fgets(str, sizeof(str), stdin);
    
    // Remove newline if present
    str[strcspn(str, "\n")] = 0;
    
    if (isPalindrome(str))
        printf("\"%s\" is a PALINDROME!\n", str);
    else
        printf("\"%s\" is NOT a palindrome.\n", str);
    
    return 0;
}
