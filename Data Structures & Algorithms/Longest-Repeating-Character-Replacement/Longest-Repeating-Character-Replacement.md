# Longest Repeating Character Replacement

## Logic & Explaination

### 1. Two-Pointer Window
We initialize two pointers, `left` and `right`, both starting at index 0. The `right` pointer traverses the string from start to finish, expanding our "window" one character at a time.

### 2. Real-Time Frequency Tracking
As the `right` pointer moves, we pick up each character and store it in a frequency map (or hash table). We track the frequency of every character within the current window in real-time. 

### 3. The "Anchor" (Max Frequency)
In every iteration, we identify the character with the **highest frequency** (`maxFreq`) in the current window. This character acts as our "Anchor"—the one we want to keep as is.

### 4. The Replacement Budget (K)
To make all characters in the window identical, we calculate how many "corrections" are needed:
> **Corrections Needed = (Total Window Size) - (Frequency of the Anchor)**

We compare this to `K` (our allowed budget). 
* **If Corrections Needed ≤ K:** The window is valid. We continue expanding.
* **If Corrections Needed > K:** The window is invalid. We must shrink the window by moving the `left` pointer forward by one and updating our frequency of the character that has left the current window.

### 5. Metadata vs. Transformation
Crucially, we are **not actually replacing** or "correcting" the characters. We are simply using the math to check if the current window *could* be corrected within the allowed budget.

### 6. Result
Once the `right` pointer reaches the end of the string, the size of the largest valid window we encountered during the traversal is our answer. Even if the final window contains multiple distinct characters, our logic ensures that the number of "non-anchor" characters never exceeded the limit `K`.
