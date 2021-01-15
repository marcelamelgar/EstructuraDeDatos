import practice
import unittest

class TestCode(unittest.TestCase):

    def testingPractice(self):
        self.assertEqual(practice.verificacionNotas(45), 'C')

if __name__ == '__main__':
    unittest.main()