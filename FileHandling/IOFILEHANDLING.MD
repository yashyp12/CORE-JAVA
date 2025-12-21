Step-by-Step Internal Process:
Object Creation (new FileOutputStream("data.txt"))

Checks if the file exists, if not, creates it

1 Opens a connection (file descriptor) to the file at OS level
2 Prepares a buffer in memory to store data temporarily
3 Writing Data (fos.write(98))

Converts the integer 98 to a byte (binary: 01100010)
Stores this byte in an internal buffer (temporary memory)
When buffer is full OR when close() is called, it writes to disk
Closing Stream (fos.close())

Flushes remaining data from buffer to file
Releases the file descriptor
Frees up system resources


Why Binary?
FileOutputStream writes raw bytes directly
In your code, 98 is the ASCII value for letter 'b'
So data.txt will contain the character 'b'

Key Points:
Buffering: Data doesn't write immediately - it's buffered for efficiency
OS Level: Java talks to the operating system to access files
Resource Management: Must close the stream to ensure data is saved and resources are freed


Memory Flow:


Your Program → Internal Buffer (RAM) → File on Disk
     98      →      byte(98)         →   'b' in data.txt