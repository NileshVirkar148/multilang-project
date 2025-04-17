<?php
require 'vendor/autoload.php';

use Symfony\Component\HttpFoundation\Request;

echo "Hello, PHP!\n";
$request = Request::createFromGlobals();
echo "Symfony Request created\n";