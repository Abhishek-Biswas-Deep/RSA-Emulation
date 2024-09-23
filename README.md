<img src="https://github.com/user-attachments/assets/2ad86f70-12b4-4500-997d-9f8c1874a9b5" alt="Dal logo" width="80"/>
<h1>Associated with Dalhousie University</h1>

### CSCI4174
### RSA Emulation
This Java program emulates the RSA (Rivest–Shamir–Adleman) cryptosystem, a widely used public-key cryptographic algorithm. It demonstrates the basic principles of RSA encryption and decryption.

#### Features

- Generation of public and private RSA keys
- Encryption of plaintext messages
- Decryption of ciphertext messages
- Interactive command-line interface

#### How to Use

1. Compile the Java file.
2. Run the program.
3. Follow the prompts:
- The program will display the public and private keys, encrypt your message, and then decrypt it

#### Implementation Details
The program implements the following RSA operations:

- Key generation: Calculates n (p * q) and φ(n) ((p-1) * (q-1)), then chooses suitable values for e and d
- Encryption: c = m^e mod n
- Decryption: m = c^d mod n

It also includes helper functions for calculating GCD and modular exponentiation.

#### Limitations
This implementation is for educational purposes and is not cryptographically secure. It uses small prime numbers and does not implement padding or other security measures required for real-world applications.

#### Sample input and output
```
Enter the prime numbers, p and q: 11 17
Calculating RSA value ...
Public RSA key is (3, 187)
Private RSA key is (107, 187)
Enter the plaintext message m (an integer): 5
Encrypting m...
The ciphertext c is 125
Decrypting c ...
The plaintext m is 5

Process finished with exit code 0

Enter the prime numbers, p and q: 10 15
Calculating RSA value ...
Public RSA key is (5, 150)
Private RSA key is (101, 150)
Enter the plaintext message m (an integer): 3
Encrypting m...
The ciphertext c is 93
Decrypting c ...
The plaintext m is 93

Process finished with exit code 0

Enter the prime numbers, p and q: 5 7
Calculating RSA value ...
Public RSA key is (5, 35)
Private RSA key is (5, 35)
Enter the plaintext message m (an integer): 8
Encrypting m...
The ciphertext c is 8
Decrypting c ...
The plaintext m is 8

Process finished with exit code 0
```
