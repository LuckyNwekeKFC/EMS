 

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


 
-- Database: `employee-management-system`
 

-- --------------------------------------------------------

 
-- Table structure for table `employee`
 

CREATE TABLE `employee` (
  `name` varchar(25) DEFAULT NULL,
  `fname` varchar(30) DEFAULT NULL,
  `age` varchar(10) DEFAULT NULL,
  `dob` varchar(20) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `education` varchar(15) DEFAULT NULL,
  `post` varchar(15) DEFAULT NULL,
  `aadhar` varchar(20) DEFAULT NULL,
  `emp_id` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- adding test data
INSERT INTO `employee` (`name`, `fname`, `age`, `dob`, `address`, `phone`, `email`, `education`, `post`, `aadhar`, `emp_id`) VALUES
('Goodness', 'Amadasun', '23', '2022/06/01', '54 Uwa Street.', '2348146634078', 'goodcsmart@gamil.com', 'student', 'student', '000000', '1234');

-- --------------------------------------------------------

 
-- Creating login details
CREATE TABLE `login` (
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('admin', 'admin0000');
COMMIT;

 
